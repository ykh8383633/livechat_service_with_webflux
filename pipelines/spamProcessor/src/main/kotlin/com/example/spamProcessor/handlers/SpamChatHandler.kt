package com.example.spamProcessor.handlers

import com.example.message.channel.Channel
import com.example.message.channel.InMessageChannel
import com.example.message.publisher.Publisher
import com.example.message.subscriber.handler.MessageHandler
import org.springframework.stereotype.Component

@Component
class SpamChatHandler(
    private val publisher: Publisher,
    override val channel: InMessageChannel
): MessageHandler {
    override fun handle(message: String) {
        println("process spam")

    }
}