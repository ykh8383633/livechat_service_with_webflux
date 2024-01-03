package com.example.message.channel

import com.example.message.config.properties.MessageProperties

class DoneRecentChatProcess(messageProperties: MessageProperties): Channel {
    override val channelName = messageProperties.kafka.topics.doneRecentChatProcess
}