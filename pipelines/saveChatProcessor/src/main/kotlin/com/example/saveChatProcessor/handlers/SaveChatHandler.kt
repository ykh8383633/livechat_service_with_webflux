package com.example.saveChatProcessor.handlers

import com.example.domain.model.ChatMessage
import com.example.message.channel.Channel
import com.example.message.channel.DoneRecentChatProcess
import com.example.message.channel.DoneSpamProcessChannel
import com.example.message.channel.OutMessageChannel
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
import com.example.persistence.repository.chat.command.ChatMessageCommand
import com.fasterxml.jackson.databind.ObjectMapper

class SaveChatHandler(
    private val publisher: Publisher,
    private val objectMapper: ObjectMapper,
    override val subscribedChannel: DoneRecentChatProcess,
    private val pubChannel: OutMessageChannel,
    private val chatMessageCommand: ChatMessageCommand,
    ): MessageHandler {

    override fun handle(message: String) {
        val chatMessage = objectMapper.readValue(message, ChatMessage::class.java)

        chatMessageCommand.save(chatMessage)
            .doOnTerminate{ publisher.publish(pubChannel.channelName, objectMapper.writeValueAsString(chatMessage)) }
            .subscribe();
    }
}