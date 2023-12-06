package com.example.api.service

import com.example.api.component.ChatManager
import com.example.api.component.ChatUser
import com.example.message.config.properties.MessageProperties
import com.example.message.model.ChatMessage
import org.springframework.stereotype.Service
import com.example.message.publisher.Publisher
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Mono

@Service
class ChatService(
    private val publisher: Publisher,
    private val messageProps: MessageProperties,
    private val chatManager: ChatManager,
    private val objectMapper: ObjectMapper
) {
    private val OUT_MESSAGE = messageProps.kafka.topics.outMessage
    private val IN_MESSAGE = messageProps.kafka.topics.inMessage

    fun registerUser(roomId: String, userId: String, session: WebSocketSession){
        val user = ChatUser(session, userId)
        chatManager.registerUser(roomId, user);
        val chat = ChatMessage(roomId, user.userId, "사용자가 입장하였습니다.", true)
        broadcastToRoom(chat);
    }

    fun inMessage(roomId: String, senderId: String, message: String){
        val chat = ChatMessage(roomId, senderId, message);
        val json = objectMapper.writeValueAsString(chat);
        publisher.publish(IN_MESSAGE, json)
    }

    fun broadcastToRoom(chat: ChatMessage){
        publisher.publish(OUT_MESSAGE,
            objectMapper.writeValueAsString(ChatMessage(chat.roomId, chat.senderId, chat.message, chat.valid)))
    }



}
