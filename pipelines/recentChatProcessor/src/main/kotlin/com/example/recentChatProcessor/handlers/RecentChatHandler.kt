package com.example.recentChatProcessor.handlers

import com.example.message.channel.DoneSpamProcessChannel
import com.example.message.channel.OutMessageChannel
import com.example.domain.model.ChatMessage
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
import com.example.redis.service.RedisService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class RecentChatHandler(
    private val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    private val redisService: RedisService,
    override val subscribedChannel: DoneSpamProcessChannel,
    private val pubChannel: OutMessageChannel,
    @Value("\${maxRecentChat}") private val _maxLen: Long
): MessageHandler {

    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)
        val json = objectMapper.writeValueAsString(chatMessage)
        val roomId = chatMessage.room.roomId

        redisService.leftPush(roomId, json)
            .filter{ currentLength -> currentLength > _maxLen }
            .flatMap { redisService.trimLeft(roomId, _maxLen) }
            .subscribe()

        publisher.publish(pubChannel.channelName, json);
    }
}