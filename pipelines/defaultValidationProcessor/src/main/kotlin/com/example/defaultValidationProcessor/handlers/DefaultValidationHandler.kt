package com.example.defaultValidationProcessor.handlers

import com.example.message.channel.Channel
import com.example.message.channel.DoneRecentChatProcessChannel
import com.example.message.channel.InMessageChannel
import com.example.message.channel.OutMessageChannel
import com.example.message.config.properties.MessageProperties
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.ChatProcessorMessageHandler
import com.example.message.subscriber.handler.MessageHandler
import com.example.persistence.repository.chat.command.ChatMessageCommand
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class DefaultValidationHandler(
    private val objectMapper: ObjectMapper,
    private val chatMessageCommand: ChatMessageCommand,
    override val publisher: Publisher,
    override val allChannels: MutableList<Channel>,
    @Value("\${spring.chat.processor.step}") override val processStep: Int,
    @Value("\${spring.chat.processor.lastStep}")override val lastStep: Int,
    ): ChatProcessorMessageHandler() {


    override fun handle(message: String) {
        doNextStep(message);
    }


}