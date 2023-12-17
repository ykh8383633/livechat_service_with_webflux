package com.example.recentChatProcessor.handlers

import com.example.message.channel.DoneSpamProcessChannel
import com.example.message.channel.OutMessageChannel
import com.example.domain.model.ChatMessage
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
import com.example.redis.service.RedisService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class RecentChatHandler(
    private val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    private val redisService: RedisService,
    override val subscribedChannel: DoneSpamProcessChannel,
    private val pubChannel: OutMessageChannel,
): MessageHandler {
    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)

        println("consume: ${chatMessage.room.roomId} ${chatMessage.message}")

        val json = objectMapper.writeValueAsString(chatMessage)
        redisService.leftPush(chatMessage.room.roomId, json).subscribe()

        publisher.publish(pubChannel.channelName, json);
    }
}