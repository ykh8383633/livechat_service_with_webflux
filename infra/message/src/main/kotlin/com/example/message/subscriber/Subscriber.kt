package com.example.message.subscriber

import com.example.message.channel.Channel

interface Subscriber {
    val channels: MutableSet<Channel>
}