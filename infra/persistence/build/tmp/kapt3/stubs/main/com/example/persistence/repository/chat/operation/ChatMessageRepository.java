package com.example.persistence.repository.chat.operation;

@org.springframework.stereotype.Repository
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a8\u0006\u0004"}, d2 = {"Lcom/example/persistence/repository/chat/operation/ChatMessageRepository;", "Lorg/springframework/data/mongodb/repository/ReactiveMongoRepository;", "Lcom/example/persistence/entity/ChatMessageEntity;", "", "persistence"})
public abstract interface ChatMessageRepository extends org.springframework.data.mongodb.repository.ReactiveMongoRepository<com.example.persistence.entity.ChatMessageEntity, java.lang.String> {
}