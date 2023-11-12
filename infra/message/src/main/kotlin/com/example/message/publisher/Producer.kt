package com.example.message.publisher

import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate
import org.springframework.stereotype.Component

@Component
class Producer(
    private val producerTemplate: ReactiveKafkaProducerTemplate<String, Any>
): Publisher {

    //private val logger = KotlinLogging.logger {}

    override fun publish(topic: String, message: Any) {
        val sendResult = producerTemplate.send(topic, message)

        sendResult
            .doOnSuccess {
                //logger.debug("${this::class.simpleName} send message : $message, offset: ${it.recordMetadata().offset()}")
                println("publish $topic message: $message metaData: ${it.recordMetadata()}")
            }
            .doOnError { }
            .subscribe()
    }

    override fun publish(topic: String, key: String, message: Any) {
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