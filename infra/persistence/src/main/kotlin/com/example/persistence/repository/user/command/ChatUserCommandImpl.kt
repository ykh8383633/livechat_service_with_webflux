package com.example.persistence.repository.user.command

import com.example.domain.model.ChatUser
import com.example.persistence.mapper.ChatUserMapper
import com.example.persistence.repository.user.operation.ChatUserRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
class ChatUserCommandImpl(
    private val _repository: ChatUserRepository
): ChatUserCommand {
    private val mapper = ChatUserMapper.INSTANCE

    override fun update(user: ChatUser): Mono<ChatUser> = save(user)

    override fun save(user: ChatUser): Mono<ChatUser> {
        val entity = mapper.toEntity(user);
        return _repository.save(entity).map{user}
    }
}