package com.example.domain.model

import com.example.domain.enums.UserType
import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.kotlin.core.publisher.toMono
import java.time.Instant

class ChatUser(
    @JsonIgnore var session: WebSocketSession? = null,
    val userId: String,
    var type: UserType = UserType.NORMAL_USER,
    var muteStartTime: Instant? = null
) {
    val isMuteUser: Boolean
        get() {
            return type == UserType.MUTE_USER
        }

    fun sendMessage(sender: ChatUser?, message: String){
        session ?: return

        session?.send(
            session?.textMessage(message).toMono()
        )?.subscribe()
    }
}