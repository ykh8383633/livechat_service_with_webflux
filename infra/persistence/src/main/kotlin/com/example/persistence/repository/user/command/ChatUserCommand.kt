package com.example.persistence.repository.user.command

import com.example.domain.model.ChatUser
import reactor.core.publisher.Mono

interface ChatUserCommand {
    fun save(user: ChatUser): Mono<ChatUser>
    fun update(user: ChatUser): Mono<ChatUser>
}