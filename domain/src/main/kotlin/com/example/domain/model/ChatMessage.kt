package com.example.domain.model

 class ChatMessage (
    val room: ChatRoom,
    val sender: ChatUser,
    val message: String,
    var valid: Boolean?
){
     constructor(room: ChatRoom, sender: ChatUser, message: String): this(room, sender, message, false)

 }