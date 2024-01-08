package com.example.spamProcessor.handlers

import com.example.message.channel.DoneSpamProcessChannel
import com.example.message.channel.InMessageChannel
import com.example.domain.model.ChatMessage
import com.example.message.channel.Channel
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.ChatProcessorMessageHandler
import com.example.message.subscriber.handler.MessageHandler
import com.example.persistence.repository.chat.command.ChatMessageCommand
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class SpamChatHandler(
    override val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    override val allChannels: MutableList<Channel>,
    @Value("\${spring.chat.processor.step}") override val processStep: Int,
    @Value("\${spring.chat.processor.lastStep}")override val lastStep: Int,
): ChatProcessorMessageHandler() {
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