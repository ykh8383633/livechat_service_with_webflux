package com.example.api.component

import org.springframework.web.reactive.socket.WebSocketSession

class ChatUser(
    val session: WebSocketSession,
    val userId: String
) {
}