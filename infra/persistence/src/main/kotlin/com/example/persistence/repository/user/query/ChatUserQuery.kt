package com.example.persistence.repository.user.query

import com.example.domain.model.ChatUser
import reactor.core.publisher.Mono

interface ChatUserQuery {
    fun findById(id: String): Mono<ChatUser>
}