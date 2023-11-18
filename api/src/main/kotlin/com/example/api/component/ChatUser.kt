package com.example.api.component

import org.springframework.web.reactive.socket.WebSocketSession
import reactor.kotlin.core.publisher.toMono

class ChatUser(
    val session: WebSocketSession,
    val userId: String
) {

    fun sendMessage(sender: ChatUser, message: String){
        session.send(
            session.textMessage(message).toMono()
        ).subscribe()
    }
}