package com.example.persistence.repository.chat.operation

import com.example.persistence.entity.ChatMessageEntity
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ChatMessageRepository: ReactiveMongoRepository<ChatMessageEntity, String> {
}