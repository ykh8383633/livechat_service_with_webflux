package com.example.api.service

import com.example.domain.model.ChatRoom
import com.example.domain.model.ChatUser
import com.example.message.config.properties.MessageProperties
import com.example.domain.model.ChatMessage
import org.springframework.stereotype.Service
import com.example.message.publisher.Publisher
import com.example.redis.service.RedisService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Flux
import java.time.Instant

@Service
class ChatService(
    private val publisher: Publisher,
    private val messageProps: MessageProperties,
    private val redisService: RedisService,
    private val objectMapper: ObjectMapper
) {
    private val OUT_MESSAGE = messageProps.kafka.topics.outMessage
    private val IN_MESSAGE = messageProps.kafka.topics.inMessage
    private val rooms = mutableMapOf<String, ChatRoom>()

    fun registerUser(roomId: String, userId: String, session: WebSocketSession): ChatUser {
        val user = ChatUser(session, userId)
        rooms.getOrPut(roomId) { ChatRoom(roomId) }.registerUser(user)
        return user;
    }

    fun inMessage(roomId: String, sender: ChatUser, message: String, valid: Boolean = false){
        val room = rooms[roomId] ?: throw Exception("room can not be empty")
        val chat = ChatMessage(room, sender, message, valid);

        publisher.publish(IN_MESSAGE, objectMapper.writeValueAsString(chat))
    }

    fun outMessage(roomId: String, sender: ChatUser, message: String, valid: Boolean = false){
        val room = rooms[roomId] ?: throw Exception("room can not be empty")
        val chat = ChatMessage(room, sender, message, valid);

        publisher.publish(OUT_MESSAGE, objectMapper.writeValueAsString(chat))
    }

    fun broadcastToRoom(chat: ChatMessage){
        val room = rooms.getOrDefault(chat.room.roomId, null) ?: return
        val jsonChat = objectMapper.writeValueAsString(chat);
        room.broadCast(chat.sender.userId, jsonChat);
    }

    fun getRecentChat(roomId: String): Flux<ChatMessage> {
        return redisService.getAll<ChatMessage>(roomId, ChatMessage::class.java)
            .sort{c1, c2 -> c1.sendDate.compareTo(c2.sendDate)}
            .doOnError{println(it.message)}
    }

}
