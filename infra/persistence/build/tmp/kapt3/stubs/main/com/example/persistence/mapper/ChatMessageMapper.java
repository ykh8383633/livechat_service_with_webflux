package com.example.persistence.mapper;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/persistence/mapper/ChatMessageMapper;", "", "toEntity", "Lcom/example/persistence/entity/ChatMessageEntity;", "chat", "Lcom/example/domain/model/ChatMessage;", "Companion", "persistence"})
@org.mapstruct.Mapper
public abstract interface ChatMessageMapper {
    @kotlin.jvm.JvmField
    public static final com.example.persistence.mapper.ChatMessageMapper INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.persistence.mapper.ChatMessageMapper.Companion Companion = null;
    
    @org.mapstruct.Mappings(value = {@org.mapstruct.Mapping(target = "roomId", source = "chat.room.roomId"), @org.mapstruct.Mapping(target = "senderId", source = "chat.sender.userId")})
    @org.jetbrains.annotations.NotNull
    public abstract com.example.persistence.entity.ChatMessageEntity toEntity(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatMessage chat);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/example/persistence/mapper/ChatMessageMapper$Companion;", "", "()V", "INSTANCE", "Lcom/example/persistence/mapper/ChatMessageMapper;", "kotlin.jvm.PlatformType", "persistence"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}