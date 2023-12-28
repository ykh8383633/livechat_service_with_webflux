package com.example.persistence.repository.chat.command

import com.example.domain.model.ChatMessage
import reactor.core.publisher.Mono

interface ChatMessageCommand {
    fun save(chat: ChatMessage): Mono<ChatMessage>
    fun update(chat: ChatMessage): Mono<ChatMessage>
}