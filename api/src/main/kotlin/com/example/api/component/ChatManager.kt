package com.example.api.component

import org.springframework.stereotype.Component

@Component
class ChatManager {
    private val rooms = mutableMapOf<String, ChatRoom>()


    fun registerUser(roomId: String, user: ChatUser){
        rooms.getOrPut(roomId) { ChatRoom(roomId) }.registerUser(user)
    }

    fun broadcastToRoom(roomId: String, senderId: String, message: String){
        val room = rooms.getOrDefault(roomId, null) ?: return
        room.broadCast(senderId, message);
    }
}