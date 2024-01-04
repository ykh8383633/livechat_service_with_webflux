package com.example.api.service.handler

import com.example.api.service.ChatService
import com.example.domain.model.Alert
import com.example.message.channel.OutAlertChannel
import com.example.message.subscriber.handler.MessageHandler
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class OutAlertHandler(
    private val chatService: ChatService,
    private val objectMapper: ObjectMapper,
    override val subscribedChannel: OutAlertChannel
): MessageHandler {
    override fun handle(message: String) {
        val alert = objectMapper.readValue(message, Alert::class.java)
        chatService.alertToRoom(alert);
    }
}