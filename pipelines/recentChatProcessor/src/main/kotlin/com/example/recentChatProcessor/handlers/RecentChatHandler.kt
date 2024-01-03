package com.example.recentChatProcessor.handlers

import com.example.domain.enums.RedisKey
import com.example.message.channel.DoneSpamProcessChannel
import com.example.message.channel.OutMessageChannel
import com.example.domain.model.ChatMessage
import com.example.message.channel.DoneRecentChatProcess
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
import com.example.persistence.repository.chat.command.ChatMessageCommand
import com.example.redis.service.RedisService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import java.time.Instant

@Component
class RecentChatHandler(
    private val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    private val redisService: RedisService,
    override val subscribedChannel: DoneSpamProcessChannel,
    private val pubChannel: DoneRecentChatProcess,
    private val chatMessageCommand: ChatMessageCommand,
    @Value("\${maxRecentChat}") private val _maxLen: Long
): MessageHandler {

    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)

        if(chatMessage.valid != true){
            publisher.publish(pubChannel.channelName, objectMapper.writeValueAsString(chatMessage));
            return;
        }

        val roomId = chatMessage.room.roomId
        val redisKey = RedisKey.RECENT_CHAT.createKey(roomId);

        isTooMuchChatter(chatMessage)
            .filter{ it == false}  // 채팅 도배가 아닌 경우만 최근 목록(redis)에 저장
            .switchIfEmpty(Mono.defer{
                chatMessage.valid = false
                chatMessageCommand.save(chatMessage)
                Mono.empty<Boolean>()
            })
            .flatMap { redisService.leftPush(redisKey, objectMapper.writeValueAsString(chatMessage)) }
            .filter{ currentLength -> currentLength > _maxLen }
            .flatMap { redisService.trimLeft(redisKey, _maxLen) }
            .doOnTerminate { publisher.publish(pubChannel.channelName, objectMapper.writeValueAsString(chatMessage)) }
            .subscribe()
    }

    private fun isTooMuchChatter(chat: ChatMessage): Mono<Boolean>{
        val key = RedisKey.RECENT_CHAT.createKey(chat.room.roomId)
        return redisService.range(key, 0, _maxLen, ChatMessage::class.java)
            .filter {Instant.now().minusSeconds(30) < it.sendDate &&
                    it.sender.userId == chat.sender.userId }
            .count()
            .map{ userChatCount ->
                !chat.room.allowTooMuchChatter && (userChatCount.toDouble() / _maxLen)* 100 > 20
            }
    }
}