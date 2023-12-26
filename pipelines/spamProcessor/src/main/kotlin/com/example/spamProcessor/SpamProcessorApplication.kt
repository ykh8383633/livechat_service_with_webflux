package com.example.spamProcessor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration
import org.springframework.boot.runApplication


@SpringBootApplication(
    scanBasePackages = ["com.example"],
    exclude = [KafkaAutoConfiguration::class, RedisAutoConfiguration::class]
)
class SpamProcessorApplication

fun main(args: Array<String>) {
    runApplication<SpamProcessorApplication>(*args)
}