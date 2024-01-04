package com.example.message.channel

import com.example.message.config.properties.MessageProperties
import org.springframework.stereotype.Component

@Component
class OutAlertChannel(
    messageProperties: MessageProperties
): Channel {
    override val channelName: String = messageProperties.kafka.topics.outAlert
}