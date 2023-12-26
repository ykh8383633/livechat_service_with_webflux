package com.example.redis.service;

@org.springframework.stereotype.Component
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J*\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000e\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0016J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u0002H\u0010H\u0016\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J:\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000e\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0016J)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u0002H\u0010H\u0016\u00a2\u0006\u0002\u0010\u0017J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016J&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0015H\u0016RN\u0010\b\u001aB\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004 \n* \u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\t0\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000RN\u0010\u000b\u001aB\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004 \n* \u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\f0\fX\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/redis/service/RedisServiceImpl;", "Lcom/example/redis/service/RedisService;", "redisTemplate", "Lorg/springframework/data/redis/core/ReactiveRedisTemplate;", "", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lorg/springframework/data/redis/core/ReactiveRedisTemplate;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "listOps", "Lorg/springframework/data/redis/core/ReactiveListOperations;", "kotlin.jvm.PlatformType", "valueOps", "Lorg/springframework/data/redis/core/ReactiveValueOperations;", "getAll", "Lreactor/core/publisher/Flux;", "key", "TValue", "clazz", "Ljava/lang/Class;", "leftPush", "Lreactor/core/publisher/Mono;", "", "value", "(Ljava/lang/String;Ljava/lang/Object;)Lreactor/core/publisher/Mono;", "range", "start", "end", "set", "", "trim", "trimLeft", "index", "redis"})
public class RedisServiceImpl implements com.example.redis.service.RedisService {
    @org.jetbrains.annotations.NotNull
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    private final org.springframework.data.redis.core.ReactiveValueOperations<java.lang.String, java.lang.String> valueOps = null;
    private final org.springframework.data.redis.core.ReactiveListOperations<java.lang.String, java.lang.String> listOps = null;
    
    public RedisServiceImpl(@org.jetbrains.annotations.NotNull
    org.springframework.data.redis.core.ReactiveRedisTemplate<java.lang.String, java.lang.String> redisTemplate, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public <TValue extends java.lang.Object>reactor.core.publisher.Mono<java.lang.Boolean> set(@org.jetbrains.annotations.NotNull
    java.lang.String key, TValue value) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public reactor.core.publisher.Mono<java.lang.Boolean> set(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public <TValue extends java.lang.Object>reactor.core.publisher.Mono<java.lang.Long> leftPush(@org.jetbrains.annotations.NotNull
    java.lang.String key, TValue value) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public reactor.core.publisher.Mono<java.lang.Long> leftPush(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public reactor.core.publisher.Mono<java.lang.Boolean> trimLeft(@org.jetbrains.annotations.NotNull
    java.lang.String key, long index) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public reactor.core.publisher.Mono<java.lang.Boolean> trim(@org.jetbrains.annotations.NotNull
    java.lang.String key, long start, long end) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public <TValue extends java.lang.Object>reactor.core.publisher.Flux<TValue> getAll(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.Class<TValue> clazz) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public reactor.core.publisher.Flux<java.lang.String> getAll(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public <TValue extends java.lang.Object>reactor.core.publisher.Flux<TValue> range(@org.jetbrains.annotations.NotNull
    java.lang.String key, long start, long end, @org.jetbrains.annotations.NotNull
    java.lang.Class<TValue> clazz) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public reactor.core.publisher.Flux<java.lang.String> range(@org.jetbrains.annotations.NotNull
    java.lang.String key, long start, long end) {
        return null;
    }
}