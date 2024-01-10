package com.example.spamProcessor.handlers.validator;

@org.springframework.stereotype.Component
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0012J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/spamProcessor/handlers/validator/AhoCorasickSpamChatValidator;", "Lcom/example/domain/model/ChatValidator;", "redisService", "Lcom/example/redis/service/RedisService;", "(Lcom/example/redis/service/RedisService;)V", "trie", "Lorg/ahocorasick/trie/Trie;", "createReason", "", "includedWords", "", "validate", "Lcom/example/domain/model/ChatValidateResult;", "chat", "Lcom/example/domain/model/ChatMessage;", "spamProcessor"})
public class AhoCorasickSpamChatValidator implements com.example.domain.model.ChatValidator {
    private org.ahocorasick.trie.Trie trie;
    
    public AhoCorasickSpamChatValidator(@org.jetbrains.annotations.NotNull
    com.example.redis.service.RedisService redisService) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.domain.model.ChatValidateResult validate(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatMessage chat) {
        return null;
    }
    
    private java.lang.String createReason(java.lang.Iterable<java.lang.String> includedWords) {
        return null;
    }
}