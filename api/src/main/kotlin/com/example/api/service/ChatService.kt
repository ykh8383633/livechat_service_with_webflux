package com.example.api.service

import com.example.api.component.ChatManager
import com.example.api.component.ChatUser
import com.example.api.model.messages.ChatMessage
import com.example.message.config.properties.MessageProperties
import org.springframework.stereotype.Service
import com.example.message.publisher.Publisher
import org.springframework.web.reactive.socket.WebSocketSession

@Service
class ChatService(
    private val publisher: Publisher,
    private val messageProps: MessageProperties,
    private val chatManager: ChatManager
) {

    fun registUser(roomId: String, session: WebSocketSession){
        val user = ChatUser(session, "1")
        chatManager.registUser(roomId, user);
        broadcastToRoom(user.userId, roomId, "사용자가 입장하였습니다.");
    }

    fun broadcastToRoom(useId: String, roomId: String, message: String){
        publisher.publish(messageProps.kafka.topicProperties.outMessage, ChatMessage(roomId, useId, message))
    }

}
