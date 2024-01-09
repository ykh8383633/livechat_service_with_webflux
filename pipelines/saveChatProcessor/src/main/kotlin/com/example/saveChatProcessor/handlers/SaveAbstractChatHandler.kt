package com.example.saveChatProcessor.handlers

import com.example.domain.model.ChatMessage
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.AbstractChatProcessPipeBase
import com.example.persistence.repository.chat.command.ChatMessageCommand
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class SaveAbstractChatHandler(
    override val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    private val chatMessageCommand: ChatMessageCommand,
    @Value("\${spring.chat.processor.step}") override val processStep: Int,
    @Value("\${spring.chat.processor.lastStep}")override val lastStep: Int,
    ): AbstractChatProcessPipeBase() {

    override fun process(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)

        chatMessageCommand.save(chatMessage)
            .doOnNext{ doNextStep(objectMapper.writeValueAsString(chatMessage)) }
            .subscribe();
    }
}