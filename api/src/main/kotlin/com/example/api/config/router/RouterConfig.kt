package com.example.api.config.router

import com.example.api.service.ChatService
import com.example.api.webSocketHandler.ChatWebSocketHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.HandlerMapping
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping

@Configuration
class RouterConfig(
    private val chatService: ChatService
) {

    @Bean
    fun handlerMapping(): HandlerMapping {
        val map = mapOf("/chat/{groupId}" to ChatWebSocketHandler(chatService))
        val order = -1
        return SimpleUrlHandlerMapping(map, order);
    }
}