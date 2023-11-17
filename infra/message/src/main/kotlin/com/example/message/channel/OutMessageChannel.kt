package com.example.message.channel

import com.example.message.config.properties.MessageProperties
import org.springframework.stereotype.Component

@Component
class OutMessageChannel(messageProperties: MessageProperties): Channel {
    override val channelName = messageProperties.kafka.topics.outMessage
}