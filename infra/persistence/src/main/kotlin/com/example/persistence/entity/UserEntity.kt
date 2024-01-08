package com.example.persistence.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document("chat_user")
class UserEntity {
    @Id
    var id: String? = null;
    var type: String? = null;
    var muteStartTime: Instant? = null;
}