package com.example.recentChatProcessor.handlers

import com.example.domain.enums.RedisKey
import com.example.domain.enums.UserType
import com.example.message.channel.DoneSpamProcessChannel
import com.example.domain.model.ChatMessage
import com.example.message.channel.DoneRecentChatProcessChannel
import com.example.message.config.properties.MessageProperties
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
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
    @Value("\${maxRecentChat}") private val _maxLen: Long,
    messageProps: MessageProperties,
): MessageHandler {
    private val DONE_RECENT_CHAT_PROCESS_CHANNEL = messageProps.kafka.topics.doneRecentChatProcess;
    private val OUT_ALERT = messageProps.kafka.topics.outAlert;

    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)
        var channel = DONE_RECENT_CHAT_PROCESS_CHANNEL

        if(chatMessage.valid != true || chatMessage.sender.isMuteUser){
            publisher.publish(channel, objectMapper.writeValueAsString(chatMessage));
            return;
        }

        val roomId = chatMessage.room.roomId
        val redisKey = RedisKey.RECENT_CHAT.createKey(roomId);

        isTooMuchChatter(chatMessage)
            .filter{ it == false}  // 채팅 도배가 아닌 경우만 최근 목록(redis)에 저장
            .switchIfEmpty(Mono.defer{
                chatMessage.valid = false

                chatMessage.sender.type = UserType.BANNED_USER
                chatMessage.sender.muteStartTime = Instant.now()

                channel = OUT_ALERT

                Mono.empty<Boolean>()
            })
            .flatMap { redisService.leftPush(redisKey, objectMapper.writeValueAsString(chatMessage)) }
            .filter{ currentLength -> currentLength > _maxLen }
            .flatMap { redisService.trimLeft(redisKey, _maxLen) }
            .doOnTerminate { publisher.publish(channel, objectMapper.writeValueAsString(chatMessage)) } // 수정 필요
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