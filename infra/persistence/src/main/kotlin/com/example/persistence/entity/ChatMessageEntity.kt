package com.example.persistence.entity

import com.example.domain.model.ChatRoom
import com.example.domain.model.ChatUser
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collation = "livechat")
class ChatMessageEntity {
    @Id
    var id: String? = null;
    var roomId: String? = null;
    var senderId: String? = null;
    var message: String? = null;
    var valid: Boolean? = null;
    var sendDate: Instant? = null;
}