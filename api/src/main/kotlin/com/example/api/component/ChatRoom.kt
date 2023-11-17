package com.example.api.component

import org.springframework.stereotype.Component

class ChatRoom {
    private val users = HashSet<ChatUser>()

    fun registerUser(user: ChatUser){
        users.add(user)
    }

}