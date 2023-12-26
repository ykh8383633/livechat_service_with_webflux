package com.example.persistence.mapper

import com.example.domain.model.ChatMessage
import com.example.persistence.entity.ChatMessageEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import org.mapstruct.factory.Mappers

@Mapper
interface ChatMessageMapper {
    companion object {
        @JvmField val INSTANCE = Mappers.getMapper(ChatMessageMapper::class.java)
    }
    @Mappings(
        Mapping(target="roomId", source = "chat.room.roomId"),
        Mapping(target="senderId", source = "chat.sender.userId")
    )
    fun toEntity(chat: ChatMessage): ChatMessageEntity
}