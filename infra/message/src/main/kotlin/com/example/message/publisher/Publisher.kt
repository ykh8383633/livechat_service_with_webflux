package com.example.message.publisher

import org.springframework.kafka.support.SendResult
import reactor.core.publisher.Mono
import reactor.kafka.sender.SenderResult

interface Publisher {
    fun publish(topic: String, message: String)
    fun publish(topic: String, key: String, message: String)
}