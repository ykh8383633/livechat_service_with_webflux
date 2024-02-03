package com.example.spamProcessor.handlers

import com.example.domain.model.*
import com.example.message.config.properties.MessageProperties
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.AbstractChatProcessPipeBase
import com.example.spamProcessor.handlers.validator.AhoCorasickSpamChatValidator
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class SpamAbstractChatHandler(
    override val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    private val spamChatValidator: ChatValidator,
    @Value("\${spring.chat.processor.step}") override val processStep: Int,
    @Value("\${spring.chat.processor.lastStep}")override val lastStep: Int,
    messageProps: MessageProperties,
): AbstractChatProcessPipeBase() {
    private val OUT_ALERT = messageProps.kafka.topics.outAlert;
    private var _spamChatAlertMessage: String? = null;

    override fun process(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)

        if(!checkMessage(chatMessage)){
            chatMessage.valid = false;
            alertToUser(chatMessage.sender, chatMessage.room);
        }

        val json = objectMapper.writeValueAsString(chatMessage)
        doNextStep(json);
    }

    private fun checkMessage(chat: ChatMessage): Boolean {
        val result = spamChatValidator.validate(chat);

        if(!result.reason.isNullOrEmpty()){
            _spamChatAlertMessage = result.reason;
        }

        return result.valid;
    }

    private fun alertToUser(user: ChatUser, room: ChatRoom){
        val alert = Alert(
            message = _spamChatAlertMessage ?: "SPAM_CHAT!!",
            targetUser = mutableListOf(user),
            room = room
        )
        publisher.publish(OUT_ALERT, objectMapper.writeValueAsString(alert))
    }
}