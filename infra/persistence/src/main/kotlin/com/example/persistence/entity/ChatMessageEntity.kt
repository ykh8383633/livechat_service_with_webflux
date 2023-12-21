package com.example.persistence.entity

import org.springframework.data.mongodb.core.mapping.Document

@Document(collation = "chat")
class ChatMessageEntity {
}