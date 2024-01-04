package com.example.persistence.repository.user.query

import com.example.domain.model.ChatUser
import com.example.persistence.mapper.ChatUserMapper
import com.example.persistence.repository.user.operation.ChatUserRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
class ChatUserQueryImpl(
    private val _repository: ChatUserRepository
): ChatUserQuery {
    private val mapper = ChatUserMapper.INSTANCE

    override fun findById(id: String): Mono<ChatUser> {
        return _repository.findById(id).map{ mapper.toDomain(it) }
    }
}