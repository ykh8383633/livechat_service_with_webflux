package com.example.message.channel

import com.example.message.config.properties.MessageProperties
import org.springframework.stereotype.Component

@Component
class ChatProcessStep3(messageProperties: MessageProperties): Channel {
    override val channelName: String = messageProperties.kafka.topics.step3
}