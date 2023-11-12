package com.example.api.component

import org.springframework.stereotype.Component

class ChatRoom {
    private val users = HashSet<ChatUser>()

    fun registUser(user: ChatUser){
        users.add(user)
    }

}