package com.example.saveChatProcessor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example"], exclude = [KafkaAutoConfiguration::class, RedisAutoConfiguration::class])
class SaveChatProcessorApplication {
}

fun main(args: Array<String>) {
    runApplication<SaveChatProcessorApplication>(*args)
}