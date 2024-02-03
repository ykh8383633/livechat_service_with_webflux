package com.example.message.publisher

import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate
import org.springframework.kafka.support.SendResult
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.kafka.sender.SenderResult

@Component
class Producer(
    private val producerTemplate: ReactiveKafkaProducerTemplate<String, String>
): Publisher {

    //private val logger = KotlinLogging.logger {}

    override fun publish(topic: String, message: String) {
        producerTemplate.send(topic, message).doOnSuccess {
                //logger.debug("${this::class.simpleName} send message : $message, offset: ${it.recordMetadata().offset()}")
                println("publish $topic message: $message metaData: ${it.recordMetadata()}")
            }
            .doOnError { println(it.message)}
            .subscribe()
    }

    override fun publish(topic: String, key: String, message: String) {
        val sendResult = producerTemplate.send(topic, key, message)

        sendResult
            .doOnSuccess {
                //logger.debug("${this::class.simpleName} send message : $message, offset: ${it.recordMetadata().offset()}")
                println("publish $topic message: $message")
            }
            .doOnError { }
            .subscribe()
    }
}