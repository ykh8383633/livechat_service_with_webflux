package com.example.spamProcessor.handlers

import com.example.domain.model.ChatMessage
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.AbstractChatProcessPipeBase
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class SpamAbstractChatHandler(
    override val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    @Value("\${spring.chat.processor.step}") override val processStep: Int,
    @Value("\${spring.chat.processor.lastStep}")override val lastStep: Int,
): AbstractChatProcessPipeBase() {
    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)
        chatMessage.valid = checkMessage(chatMessage)

        val json = objectMapper.writeValueAsString(chatMessage)
        doNextStep(json);
    }

    private fun checkMessage(chat: ChatMessage): Boolean {
        return true;
    }
}