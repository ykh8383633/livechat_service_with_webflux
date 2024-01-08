package com.example.defaultValidationProcessor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example"], exclude = [KafkaAutoConfiguration::class, RedisAutoConfiguration::class])
class DefaultValidationProcessorApplication {
}

fun main(args: Array<String>) {
    runApplication<DefaultValidationProcessorApplication>(*args)
}