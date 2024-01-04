package com.example.persistence.mapper

import com.example.domain.model.ChatMessage
import com.example.domain.model.ChatUser
import com.example.persistence.entity.ChatMessageEntity
import com.example.persistence.entity.UserEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import org.mapstruct.factory.Mappers

@Mapper
interface ChatUserMapper {
    companion object {
        @JvmField val INSTANCE = Mappers.getMapper(ChatUserMapper::class.java)
    }

    @Mappings(
        Mapping(target = "id", source = "user.userId"),
        Mapping(target = "type", source = "user.type.typeString")
    )
    fun toEntity(user: ChatUser): UserEntity

    @Mappings(
        Mapping(target = "userId", source = "entity.id"),
        Mapping(target = "type", expression = "java(UserType.parse(entity.getType()))")
    )
    fun toDomain(entity: UserEntity): ChatUser
}