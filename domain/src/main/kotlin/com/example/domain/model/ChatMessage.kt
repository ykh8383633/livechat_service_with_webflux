package com.example.domain.model

import java.time.Instant

class ChatMessage (
    val room: ChatRoom,
    val sender: ChatUser,
    val message: String,
    var valid: Boolean?,
    var sendDate: Instant
){

     constructor(room: ChatRoom, sender: ChatUser, message: String)
             : this(room, sender, message, false, Instant.now())
    constructor(room: ChatRoom, sender: ChatUser, message: String, valid: Boolean,)
            : this(room, sender, message, valid, Instant.now()){
    }

 }