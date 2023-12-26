package com.example.persistence.repository.chat.command

import com.example.domain.model.ChatMessage

interface ChatMessageCommand {
    fun save(chat: ChatMessage)
}