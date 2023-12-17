package com.example.domain.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.kotlin.core.publisher.toMono

class ChatUser(
    val userId: String,
) {
    @JsonIgnore var session: WebSocketSession? = null
    constructor(session: WebSocketSession, userId: String): this(userId){
        this.session = session
    }

    fun sendMessage(sender: ChatUser, message: String){
        session ?: return

        session?.send(
            session?.textMessage(message).toMono()
        )?.subscribe()
    }
}