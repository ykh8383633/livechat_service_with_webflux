package com.example.message.publisher

interface Publisher {
    fun publish(topic: String, message: Any)
    fun publish(topic: String, key: String, message: Any)
}