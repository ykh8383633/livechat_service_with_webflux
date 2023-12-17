package com.example.api.webSocketHandler

import com.example.api.service.ChatService
import com.example.domain.model.ChatMessage
import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.reactor.awaitSingle
import kotlinx.coroutines.reactor.awaitSingleOrNull
import org.springframework.web.reactive.socket.WebSocketHandler
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono
import java.net.URI
import java.net.URLDecoder

class ChatWebSocketHandler(
    private val chatService: ChatService,
    private val objectMapper: ObjectMapper
): WebSocketHandler {
    override fun handle(session: WebSocketSession): Mono<Void> {
        val url = session.handshakeInfo.uri;
        val roomId = getRoomId(url)
        val userId = getUserId(url)
        val user = chatService.registerUser(roomId, userId, session)

        return chatService.getRecentChat(roomId)
            .map{
                user.sendMessage(it.sender, objectMapper.writeValueAsString(it))
            }
            .doOnComplete{
                val message = "${user.userId} 사용자가 입장했습니다."
                chatService.outMessage(roomId, user, message, true)
            }
            .then(
                session.receive()
                    .map{it.payloadAsText}
                    .doOnNext{chatService.inMessage(roomId, user, it)}
                    .doOnComplete{session.close()}
                    .then()
            )
    }

    private fun getRoomId(url: URI): String {
        return "1";
    }

    private fun getUserId(url: URI): String{
        val queries = parseQueryString(url);
        val userId = queries["user-id"]

        if(userId.isNullOrEmpty()){
            throw Exception("user id cannot be empty!");
        }

        return userId;
    }

    private fun parseQueryString(uri: URI): Map<String, String> {
        val queryPairs = mutableMapOf<String, String>()

        val query: String? = uri.query
        if (!query.isNullOrEmpty()) {
            val pairs = query.split("&")

            val encoding = "UTF-8"
            pairs.filter { it.isNotEmpty() }
                .forEach {
                val idx = it.indexOf("=")
                queryPairs[URLDecoder.decode(it.substring(0, idx), encoding)] =
                    URLDecoder.decode(it.substring(idx + 1), encoding)
            }
        }

        return queryPairs
    }
}