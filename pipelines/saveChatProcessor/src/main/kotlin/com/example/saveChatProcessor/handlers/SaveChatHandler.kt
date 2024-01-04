package com.example.saveChatProcessor.handlers

import com.example.domain.model.ChatMessage
import com.example.message.channel.DoneRecentChatProcessChannel
import com.example.message.channel.OutMessageChannel
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
import com.example.persistence.repository.chat.command.ChatMessageCommand
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class SaveChatHandler(
    private val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    override val subscribedChannel: DoneRecentChatProcessChannel,
    private val pubChannel: OutMessageChannel,
    private val chatMessageCommand: ChatMessageCommand,
    ): MessageHandler {

    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)

        chatMessageCommand.save(chatMessage)
            .doOnNext{ publisher.publish(pubChannel.channelName, objectMapper.writeValueAsString(chatMessage)) }
            .subscribe();
    }
}