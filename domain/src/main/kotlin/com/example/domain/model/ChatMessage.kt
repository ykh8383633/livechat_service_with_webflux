package com.example.domain.model

import java.time.Instant

class ChatMessage (
    var id: String? = null,
    val room: ChatRoom,
    val sender: ChatUser,
    val message: String,
    var valid: Boolean?,
    var sendDate: Instant = Instant.now()
){

 }