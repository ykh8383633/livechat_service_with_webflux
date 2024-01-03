package com.example.api.service

import com.example.domain.enums.RedisKey
import com.example.domain.model.ChatRoom
import com.example.domain.model.ChatUser
import com.example.message.config.properties.MessageProperties
import com.example.domain.model.ChatMessage
import org.springframework.stereotype.Service
import com.example.message.publisher.Publisher
import com.example.persistence.repository.chat.command.ChatMessageCommand
import com.example.redis.service.RedisService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Instant

@Service
class ChatService(
    private val publisher: Publisher,
    private val redisService: RedisService,
    private val objectMapper: ObjectMapper,
    private val chatMessageCommand: ChatMessageCommand,
    messageProps: MessageProperties,
) {
    private val OUT_MESSAGE = messageProps.kafka.topics.outMessage
    private val IN_MESSAGE = messageProps.kafka.topics.inMessage
    private val rooms = mutableMapOf<String, ChatRoom>()

    fun registerUser(roomId: String, userId: String, session: WebSocketSession): ChatUser {
        val user = ChatUser(session, userId)
        rooms.getOrPut(roomId) { ChatRoom(roomId) }.registerUser(user)
        increaseUserCount(roomId).subscribe()

        return user;
    }

    fun onClose(roomId: String, user: ChatUser, session: WebSocketSession){
        val room = findRoom(roomId);
        if(room.findUser(user.userId) != null){
            room.deleteUser(user.userId);

            val key = RedisKey.USER_COUNT.createKey(roomId);
            redisService.decr(key).subscribe();
        }

        session.close()
    }

    fun increaseUserCount(roomId: String): Mono<Long>{
        val key = RedisKey.USER_COUNT.createKey(roomId);
        return redisService.incr(key)
    }

    fun getUserCount(roomId: String): Mono<Long> {
        val key = RedisKey.USER_COUNT.createKey(roomId);
        return redisService.get(key).map{it.toLong()}
    }

    fun inMessage(chat: ChatMessage){
        publisher.publish(IN_MESSAGE, objectMapper.writeValueAsString(chat))
    }

    fun saveChat(chat : ChatMessage): Mono<ChatMessage> {
        return chatMessageCommand.save(chat);
    }

    fun outMessage(chat: ChatMessage){
        publisher.publish(OUT_MESSAGE, objectMapper.writeValueAsString(chat))
    }

    fun broadcastToRoom(chat: ChatMessage){
        val room = rooms.getOrDefault(chat.room.roomId, null) ?: return
        val jsonChat = objectMapper.writeValueAsString(chat);
        room.broadCast(chat.sender.userId, jsonChat);
    }

    fun getRecentChat(roomId: String): Flux<ChatMessage> {
        val key = RedisKey.RECENT_CHAT.createKey(roomId);
        return redisService.getAll<ChatMessage>(key, ChatMessage::class.java)
            .sort{c1, c2 -> c1.sendDate.compareTo(c2.sendDate)}
            .doOnError{println(it.message)}
    }

    fun findRoom(roomId: String): ChatRoom {
        return rooms[roomId] ?: throw Exception("room can not be empty");
    }


}
