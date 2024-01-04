package com.example.message.channel

import com.example.message.config.properties.MessageProperties
import org.springframework.stereotype.Component

@Component
class DoneRecentChatProcessChannel(messageProperties: MessageProperties): Channel {
    override val channelName = messageProperties.kafka.topics.doneRecentChatProcess
}