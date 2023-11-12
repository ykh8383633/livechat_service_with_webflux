package com.example.api.model.messages

data class ChatMessage(
    val roomId: String,
    val senderId: String,
    val message: String
)
