package com.example.domain.model

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonIgnore
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.ANY)
class ChatRoom (val roomId: String){
    @JsonIgnore private val users = mutableSetOf<ChatUser>()
    val allowTooMuchChatter = false;

    fun registerUser(user: ChatUser){
        if(findUser(user.userId) != null){
            throw Exception("INVALID_USER_ID")
        }
        users.add(user)
    }

    fun alertToAll(alertContent: String){
        users.forEach{user -> user.sendMessage(null, alertContent)}
    }

    fun alertToTarget(target: MutableList<ChatUser>, alertContent: String){
        users.filter{user -> target.find{t -> t.userId == user.userId} != null}
            .forEach{user -> user.sendMessage(null, alertContent)}
    }

    fun broadCast(senderId: String, message: String){
        val sender = findUser(senderId) ?: return;
        users.forEach{user -> user.sendMessage(sender, message)}
    }

    fun findUser(userId: String): ChatUser?{
        return users.find{user -> user.userId == userId}
    }

    fun deleteUser(userId: String): Boolean{
        return users.removeIf { it.userId == userId }
    }
}