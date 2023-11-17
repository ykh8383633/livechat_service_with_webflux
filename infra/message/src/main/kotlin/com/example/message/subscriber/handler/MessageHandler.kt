package com.example.message.subscriber.handler

interface MessageHandler {
    fun handle(message: Any)
}