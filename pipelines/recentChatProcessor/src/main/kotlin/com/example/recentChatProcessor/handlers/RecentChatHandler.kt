package com.example.recentChatProcessor.handlers

import com.example.domain.enums.RedisKey
import com.example.domain.enums.UserType
import com.example.domain.model.Alert
import com.example.message.channel.DoneSpamProcessChannel
import com.example.domain.model.ChatMessage
import com.example.domain.model.ChatRoom
import com.example.domain.model.ChatUser
import com.example.message.channel.Channel
import com.example.message.channel.DoneRecentChatProcessChannel
import com.example.message.config.properties.MessageProperties
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.ChatProcessorMessageHandler
import com.example.message.subscriber.handler.MessageHandler
import com.example.redis.service.RedisService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import java.time.Instant

@Component
class RecentChatHandler(
    override val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    private val redisService: RedisService,
    override val allChannels: MutableList<Channel>,
    @Value("\${spring.chat.processor.step}") override val processStep: Int,
    @Value("\${spring.chat.processor.lastStep}")override val lastStep: Int,
    @Value("\${maxRecentChat}") private val _maxLen: Long,
    messageProps: MessageProperties,
): ChatProcessorMessageHandler() {
    private val OUT_ALERT = messageProps.kafka.topics.outAlert;

    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)

        if(chatMessage.valid != true || chatMessage.sender.isMuteUser){
            chatMessage.valid = false;
            doNextStep(objectMapper.writeValueAsString(chatMessage));
            return;
        }

        val room = chatMessage.room
        val sender = chatMessage.sender
        val redisKey = RedisKey.RECENT_CHAT.createKey(room.roomId);

        isTooMuchChatter(chatMessage)
            .filter{ it == false}  // 채팅 도배가 아닌 경우만 최근 목록(redis)에 저장
            .switchIfEmpty(Mono.defer{
                chatMessage.valid = false
                chatMessage.sender.type = UserType.MUTE_USER
                chatMessage.sender.muteStartTime = Instant.now()
                alertToUser(sender, room);

                Mono.empty<Boolean>()
            })
            .flatMap { redisService.leftPush(redisKey, objectMapper.writeValueAsString(chatMessage)) }
            .filter{ currentLength -> currentLength > _maxLen }
            .flatMap { redisService.trimLeft(redisKey, _maxLen) }
            .doOnTerminate { doNextStep(objectMapper.writeValueAsString(chatMessage)) }
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

    private fun alertToUser(user: ChatUser, room: ChatRoom){
        val alert = Alert(
            message = "30초간 채팅이 금지 되었습니다. (채팅 도배)",
            targetUser = mutableListOf(user),
            room = room
        )
        publisher.publish(OUT_ALERT, objectMapper.writeValueAsString(alert))
    }
}