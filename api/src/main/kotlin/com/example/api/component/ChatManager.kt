package com.example.api.component

import org.springframework.stereotype.Component

@Component
class ChatManager {
    private val rooms = HashMap<String, ChatRoom>()

    fun registerUser(roomId: String, user: ChatUser){
        rooms.getOrElse(roomId) { rooms.put(roomId, ChatRoom()) }?.registerUser(user)
    }
}