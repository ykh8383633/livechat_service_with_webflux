package com.example.recentChatProcessor.handlers;

@org.springframework.stereotype.Component
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0012J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020!H\u0012J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0011H\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\tX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/recentChatProcessor/handlers/RecentAbstractChatHandler;", "Lcom/example/message/subscriber/handler/AbstractChatProcessPipeBase;", "publisher", "Lcom/example/message/publisher/Publisher;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "redisService", "Lcom/example/redis/service/RedisService;", "processStep", "", "lastStep", "_maxLen", "", "messageProps", "Lcom/example/message/config/properties/MessageProperties;", "(Lcom/example/message/publisher/Publisher;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/example/redis/service/RedisService;IIJLcom/example/message/config/properties/MessageProperties;)V", "OUT_ALERT", "", "getLastStep", "()I", "getProcessStep", "getPublisher", "()Lcom/example/message/publisher/Publisher;", "alertToUser", "", "user", "Lcom/example/domain/model/ChatUser;", "room", "Lcom/example/domain/model/ChatRoom;", "isTooMuchChatter", "Lreactor/core/publisher/Mono;", "", "chat", "Lcom/example/domain/model/ChatMessage;", "process", "message", "recentChatProcessor"})
public class RecentAbstractChatHandler extends com.example.message.subscriber.handler.AbstractChatProcessPipeBase {
    @org.jetbrains.annotations.NotNull
    private final com.example.message.publisher.Publisher publisher = null;
    @org.jetbrains.annotations.NotNull
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.redis.service.RedisService redisService = null;
    private final int processStep = 0;
    private final int lastStep = 0;
    private final long _maxLen = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String OUT_ALERT = null;
    
    public RecentAbstractChatHandler(@org.jetbrains.annotations.NotNull
    com.example.message.publisher.Publisher publisher, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull
    com.example.redis.service.RedisService redisService, @org.springframework.beans.factory.annotation.Value(value = "${spring.chat.processor.step}")
    int processStep, @org.springframework.beans.factory.annotation.Value(value = "${spring.chat.processor.lastStep}")
    int lastStep, @org.springframework.beans.factory.annotation.Value(value = "${maxRecentChat}")
    long _maxLen, @org.jetbrains.annotations.NotNull
    com.example.message.config.properties.MessageProperties messageProps) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected com.example.message.publisher.Publisher getPublisher() {
        return null;
    }
    
    @java.lang.Override
    protected int getProcessStep() {
        return 0;
    }
    
    @java.lang.Override
    protected int getLastStep() {
        return 0;
    }
    
    @java.lang.Override
    public void process(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    private reactor.core.publisher.Mono<java.lang.Boolean> isTooMuchChatter(com.example.domain.model.ChatMessage chat) {
        return null;
    }
    
    private void alertToUser(com.example.domain.model.ChatUser user, com.example.domain.model.ChatRoom room) {
    }
}