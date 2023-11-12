package com.example.api.webSocketHandler

import com.example.api.service.ChatService
import kotlinx.coroutines.reactor.awaitSingle
import kotlinx.coroutines.reactor.awaitSingleOrNull
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

class ChatWebSocketHandler(
    private val chatService: ChatService
): WebSocketHandler {
    override fun handle(session: WebSocketSession): Mono<Void> {

        chatService.registUser("1", session);

        return session.receive()
            .doOnNext({})
            .then()
    }
}