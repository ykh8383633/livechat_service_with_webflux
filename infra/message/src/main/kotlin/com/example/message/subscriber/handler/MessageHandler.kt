package com.example.message.subscriber.handler

import com.example.message.channel.Channel

interface MessageHandler {
    val subscribedChannel: Channel
    fun handle(message: String)
}