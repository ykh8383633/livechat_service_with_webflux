package com.example.api.component

import org.springframework.stereotype.Component

class ChatRoom (private val roomId: String){
    private val users = mutableSetOf<ChatUser>()

    fun registerUser(user: ChatUser){
        users.add(user)
    }

    fun broadCast(senderId: String, message: String){
        val sender = findUser(senderId) ?: return;
        users.forEach{user -> user.sendMessage(sender, message)}
    }

    fun findUser(userId: String): ChatUser?{
        return users.find{user -> user.userId == userId}
    }

}