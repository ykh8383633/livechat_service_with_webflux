package com.example.domain.model

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonIgnore
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.ANY)
class ChatRoom (val roomId: String){
    @JsonIgnore private val users = mutableSetOf<ChatUser>()

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