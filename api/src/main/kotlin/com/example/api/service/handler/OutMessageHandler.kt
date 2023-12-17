package com.example.api.service.handler

import com.example.api.service.ChatService
import com.example.message.channel.OutMessageChannel
import com.example.domain.model.ChatMessage
import com.example.message.subscriber.handler.MessageHandler
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class OutMessageHandler(
    private val chatService: ChatService,
    private val objectMapper: ObjectMapper,
    override val subscribedChannel: OutMessageChannel
): MessageHandler {
    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)
        println("roomId: ${chatMessage.room.roomId}, userId: ${chatMessage.sender.userId}")
        chatService.broadcastToRoom(chatMessage);
    }
}