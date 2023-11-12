package com.example.message.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties(prefix = "spring.kafka")
class MessageProperties(
    val kafka: KafkaProps
) {
    data class KafkaProps(
        val bootstrapServer: String,
        val topicProperties: TopicProps
    )

    data class TopicProps(
        val inMessage: String,
        val outMessage: String,
    )

}