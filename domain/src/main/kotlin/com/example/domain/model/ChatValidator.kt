package com.example.domain.model

interface ChatValidator {
    fun validate(chat: ChatMessage): ChatValidateResult
}