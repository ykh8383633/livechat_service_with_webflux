package com.example.defaultValidationProcessor.handlers

import com.example.domain.enums.UserType
import com.example.domain.model.ChatMessage
import com.example.domain.model.ChatUser
import com.example.message.channel.Channel
import com.example.message.channel.DoneRecentChatProcessChannel
import com.example.message.channel.InMessageChannel
import com.example.message.channel.OutMessageChannel
import com.example.message.config.properties.MessageProperties
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.ChatProcessorMessageHandler
import com.example.message.subscriber.handler.MessageHandler
import com.example.persistence.repository.chat.command.ChatMessageCommand
import com.example.persistence.repository.user.command.ChatUserCommand
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.time.Instant

@Component
class DefaultValidationHandler(
    private val objectMapper: ObjectMapper,
    private val userCommand: ChatUserCommand,
    override val publisher: Publisher,
    @Value("\${spring.chat.processor.step}") override val processStep: Int,
    @Value("\${spring.chat.processor.lastStep}")override val lastStep: Int,
    ): ChatProcessorMessageHandler() {

    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)
        val sender = chatMessage.sender

        if(isMuteUser(sender)){
            chatMessage.valid = false;
            jumpToLastStep(objectMapper.writeValueAsString(chatMessage))
            return;
        }
        if(sender.type == UserType.MUTE_USER){
            sender.type = UserType.NORMAL_USER;
            userCommand.update(sender).subscribe()
        }

        doNextStep(objectMapper.writeValueAsString(chatMessage));
    }

    private fun isMuteUser(sender: ChatUser): Boolean{
        if(!sender.isMuteUser){
            return false
        }

        return (sender.muteStartTime?: return true).plusSeconds(30) > Instant.now()
    }

}