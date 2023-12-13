package com.example.recentChatProcessor.handlers

import com.example.message.channel.DoneSpamProcessChannel
import com.example.message.channel.InMessageChannel
import com.example.message.channel.OutMessageChannel
import com.example.message.model.ChatMessage
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class RecentChatHandler(
    private val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    override val subscribedChannel: DoneSpamProcessChannel,
    private val pubChannel: OutMessageChannel,
): MessageHandler {
    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)

        println("consume: ${chatMessage.roomId} ${chatMessage.message}")

        val json = objectMapper.writeValueAsString(chatMessage)
        publisher.publish(pubChannel.channelName, json);
    }
}