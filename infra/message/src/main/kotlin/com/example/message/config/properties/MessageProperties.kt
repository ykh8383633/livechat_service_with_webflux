package com.example.message.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties(prefix = "spring")
class MessageProperties(
    val kafka: KafkaProps
) {
    data class KafkaProps(
        val bootstrapServers: String,
        val topics: TopicProps
    )

    data class TopicProps(
        val inMessage: String,
        val outMessage: String,
        val outAlert: String,
        val doneSpamProcess: String,
        val doneRecentChatProcess: String,
        val step1: String,
        val step2: String,
        val step3: String,
        val step4: String,
    )

}