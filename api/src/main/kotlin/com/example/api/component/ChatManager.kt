package com.example.api.component

import com.example.message.model.ChatMessage
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Component

@Component
class ChatManager(
    private val objectMapper: ObjectMapper
) {
    private val rooms = mutableMapOf<String, ChatRoom>()


    fun registerUser(roomId: String, user: ChatUser){
        rooms.getOrPut(roomId) { ChatRoom(roomId) }.registerUser(user)
    }

    fun broadcastToRoom(chat: ChatMessage){
        val room = rooms.getOrDefault(chat.roomId, null) ?: return
        val jsonChat = objectMapper.writeValueAsString(chat);
        room.broadCast(chat.senderId, jsonChat);
    }
}