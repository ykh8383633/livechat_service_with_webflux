package com.example.message.model

 class ChatMessage (
    val roomId: String,
    val senderId: String,
    val message: String,
    var valid: Boolean?
){
     constructor(roomId: String, senderId: String, message: String): this(roomId, senderId, message, false)

 }