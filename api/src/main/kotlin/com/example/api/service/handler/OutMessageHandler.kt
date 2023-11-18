package com.example.api.service.handler

import com.example.api.component.ChatManager
import com.example.message.model.ChatMessage
import com.example.message.subscriber.handler.MessageHandler
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class OutMessageHandler(
    private val chatManager: ChatManager,
    private val objectMapper: ObjectMapper
): MessageHandler {
    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)
        println("roomId: ${chatMessage.roomId}, userId: ${chatMessage.senderId}")
        val chatRoom = chatMessage.roomId;
        val senderId = chatMessage.senderId;
        val contents = chatMessage.message
        chatManager.broadcastToRoom(chatRoom, senderId, contents);
    }
}