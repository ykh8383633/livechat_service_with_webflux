package com.example.recentChatProcessor.handlers;

@org.springframework.stereotype.Component
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0012J\u0010\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000fH\u0012R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/example/recentChatProcessor/handlers/RecentChatHandler;", "Lcom/example/message/subscriber/handler/MessageHandler;", "publisher", "Lcom/example/message/publisher/Publisher;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "redisService", "Lcom/example/redis/service/RedisService;", "subscribedChannel", "Lcom/example/message/channel/DoneSpamProcessChannel;", "pubChannel", "Lcom/example/message/channel/OutMessageChannel;", "chatMessageCommand", "Lcom/example/persistence/repository/chat/command/ChatMessageCommand;", "_maxLen", "", "(Lcom/example/message/publisher/Publisher;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/example/redis/service/RedisService;Lcom/example/message/channel/DoneSpamProcessChannel;Lcom/example/message/channel/OutMessageChannel;Lcom/example/persistence/repository/chat/command/ChatMessageCommand;J)V", "getSubscribedChannel", "()Lcom/example/message/channel/DoneSpamProcessChannel;", "handle", "", "message", "", "isTooMuchChatter", "Lreactor/core/publisher/Mono;", "", "chat", "Lcom/example/domain/model/ChatMessage;", "recentChatCount", "recentChatProcessor"})
public class RecentChatHandler implements com.example.message.subscriber.handler.MessageHandler {
    @org.jetbrains.annotations.NotNull
    private final com.example.message.publisher.Publisher publisher = null;
    @org.jetbrains.annotations.NotNull
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.redis.service.RedisService redisService = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.message.channel.DoneSpamProcessChannel subscribedChannel = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.message.channel.OutMessageChannel pubChannel = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.persistence.repository.chat.command.ChatMessageCommand chatMessageCommand = null;
    private final long _maxLen = 0L;
    
    public RecentChatHandler(@org.jetbrains.annotations.NotNull
    com.example.message.publisher.Publisher publisher, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull
    com.example.redis.service.RedisService redisService, @org.jetbrains.annotations.NotNull
    com.example.message.channel.DoneSpamProcessChannel subscribedChannel, @org.jetbrains.annotations.NotNull
    com.example.message.channel.OutMessageChannel pubChannel, @org.jetbrains.annotations.NotNull
    com.example.persistence.repository.chat.command.ChatMessageCommand chatMessageCommand, @org.springframework.beans.factory.annotation.Value(value = "${maxRecentChat}")
    long _maxLen) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.message.channel.DoneSpamProcessChannel getSubscribedChannel() {
        return null;
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    private boolean isTooMuchChatter(long recentChatCount) {
        return false;
    }
    
    private reactor.core.publisher.Mono<java.lang.Boolean> isTooMuchChatter(com.example.domain.model.ChatMessage chat) {
        return null;
    }
}