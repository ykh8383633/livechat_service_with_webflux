package com.example.persistence.repository.chat.command

import com.example.domain.model.ChatMessage
import com.example.persistence.mapper.ChatMessageMapper
import com.example.persistence.repository.chat.operation.ChatMessageRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
class ChatMessageCommandImpl(
    private val _repository: ChatMessageRepository
): ChatMessageCommand {
    private val chatMapper: ChatMessageMapper = ChatMessageMapper.INSTANCE;

    override fun save(chat: ChatMessage) {
        val chatEntity = chatMapper.toEntity(chat);
        _repository.save(chatEntity).subscribe();
    }

}