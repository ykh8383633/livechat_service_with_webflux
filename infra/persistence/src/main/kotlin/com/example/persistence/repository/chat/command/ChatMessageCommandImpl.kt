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

    override fun update(chat: ChatMessage): Mono<ChatMessage> = save(chat)
    override fun save(chat: ChatMessage): Mono<ChatMessage> {
        val chatEntity = chatMapper.toEntity(chat);
        return _repository.save(chatEntity).map{
            chat.id = it.id;
            chat
        };
    }




}