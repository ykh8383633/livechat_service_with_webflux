package com.example.persistence.repository.user.operation

import com.example.persistence.entity.UserEntity
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface ChatUserRepository: ReactiveMongoRepository<UserEntity, String> {
}