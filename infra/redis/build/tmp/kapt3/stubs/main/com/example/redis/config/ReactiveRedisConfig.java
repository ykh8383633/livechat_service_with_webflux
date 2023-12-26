package com.example.redis.config;

@org.springframework.context.annotation.Configuration
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0017J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/redis/config/ReactiveRedisConfig;", "", "host", "", "port", "", "(Ljava/lang/String;I)V", "redisConnFactory", "Lorg/springframework/data/redis/connection/ReactiveRedisConnectionFactory;", "redisTemplate", "Lorg/springframework/data/redis/core/ReactiveRedisTemplate;", "factory", "redis"})
public class ReactiveRedisConfig {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String host = null;
    private final int port = 0;
    
    public ReactiveRedisConfig(@org.springframework.beans.factory.annotation.Value(value = "${spring.data.redis.host}")
    @org.jetbrains.annotations.NotNull
    java.lang.String host, @org.springframework.beans.factory.annotation.Value(value = "${spring.data.redis.port}")
    int port) {
        super();
    }
    
    @org.springframework.context.annotation.Bean
    @org.jetbrains.annotations.NotNull
    public org.springframework.data.redis.connection.ReactiveRedisConnectionFactory redisConnFactory() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean
    @org.jetbrains.annotations.NotNull
    public org.springframework.data.redis.core.ReactiveRedisTemplate<java.lang.String, java.lang.String> redisTemplate(@org.jetbrains.annotations.NotNull
    org.springframework.data.redis.connection.ReactiveRedisConnectionFactory factory) {
        return null;
    }
}