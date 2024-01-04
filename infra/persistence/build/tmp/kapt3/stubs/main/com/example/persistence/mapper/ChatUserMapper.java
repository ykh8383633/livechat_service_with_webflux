package com.example.persistence.mapper;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/persistence/mapper/ChatUserMapper;", "", "toDomain", "Lcom/example/domain/model/ChatUser;", "entity", "Lcom/example/persistence/entity/UserEntity;", "toEntity", "user", "Companion", "persistence"})
@org.mapstruct.Mapper
public abstract interface ChatUserMapper {
    @kotlin.jvm.JvmField
    public static final com.example.persistence.mapper.ChatUserMapper INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.persistence.mapper.ChatUserMapper.Companion Companion = null;
    
    @org.mapstruct.Mappings(value = {@org.mapstruct.Mapping(target = "id", source = "user.userId"), @org.mapstruct.Mapping(target = "type", source = "user.type.typeString")})
    @org.jetbrains.annotations.NotNull
    public abstract com.example.persistence.entity.UserEntity toEntity(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatUser user);
    
    @org.mapstruct.Mappings(value = {@org.mapstruct.Mapping(target = "userId", source = "entity.id"), @org.mapstruct.Mapping(target = "type", expression = "java(UserType.parse(entity.getType()))")})
    @org.jetbrains.annotations.NotNull
    public abstract com.example.domain.model.ChatUser toDomain(@org.jetbrains.annotations.NotNull
    com.example.persistence.entity.UserEntity entity);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/example/persistence/mapper/ChatUserMapper$Companion;", "", "()V", "INSTANCE", "Lcom/example/persistence/mapper/ChatUserMapper;", "kotlin.jvm.PlatformType", "persistence"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}