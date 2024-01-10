package com.example.domain.model

class ChatValidateResult(
    var valid: Boolean = true,
    var chat: ChatMessage? = null,
    var reason: String? = null,
) {
}