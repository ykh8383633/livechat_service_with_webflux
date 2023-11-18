package com.example.message.publisher

interface Publisher {
    fun publish(topic: String, message: String)
    fun publish(topic: String, key: String, message: String)
}