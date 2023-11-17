package com.example.message.model

data class ChatMessage (
    val roomId: String,
    val senderId: String,
    val message: String
    )