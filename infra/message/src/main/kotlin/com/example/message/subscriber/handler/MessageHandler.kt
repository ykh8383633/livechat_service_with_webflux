package com.example.message.subscriber.handler

import com.example.message.channel.Channel

interface MessageHandler {
    val channel: Channel
    fun handle(message: String)
}