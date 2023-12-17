package com.example.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example"], exclude = [KafkaAutoConfiguration::class, RedisAutoConfiguration::class])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}
