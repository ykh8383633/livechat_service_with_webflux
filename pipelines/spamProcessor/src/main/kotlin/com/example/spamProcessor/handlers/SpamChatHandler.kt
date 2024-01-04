package com.example.spamProcessor.handlers

import com.example.message.channel.DoneSpamProcessChannel
import com.example.message.channel.InMessageChannel
import com.example.domain.model.ChatMessage
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
import com.example.persistence.repository.chat.command.ChatMessageCommand
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class SpamChatHandler(
    private val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    override val subscribedChannel: InMessageChannel,
    private val pubChannel: DoneSpamProcessChannel,
): MessageHandler {
    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)
        chatMessage.valid = checkMessage(chatMessage)

        val json = objectMapper.writeValueAsString(chatMessage)
        publisher.publish(pubChannel.channelName, json);
    }

    private fun checkMessage(chat: ChatMessage): Boolean {
        return true;
    }
}