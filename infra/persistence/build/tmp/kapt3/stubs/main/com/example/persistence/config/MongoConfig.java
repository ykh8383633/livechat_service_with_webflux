package com.example.persistence.config;

@org.springframework.context.annotation.Configuration
@org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories(basePackages = {"com.example.persistence"})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\u0003H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/persistence/config/MongoConfig;", "Lorg/springframework/data/mongodb/config/AbstractReactiveMongoConfiguration;", "host", "", "port", "", "(Ljava/lang/String;I)V", "configureClientSettings", "", "builder", "Lcom/mongodb/MongoClientSettings$Builder;", "getDatabaseName", "persistence"})
public class MongoConfig extends org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String host = null;
    private final int port = 0;
    
    public MongoConfig(@org.springframework.beans.factory.annotation.Value(value = "${spring.data.mongodb.host}")
    @org.jetbrains.annotations.NotNull
    java.lang.String host, @org.springframework.beans.factory.annotation.Value(value = "${spring.data.mongodb.port}")
    int port) {
        super();
    }
    
    @java.lang.Override
    protected void configureClientSettings(@org.jetbrains.annotations.NotNull
    com.mongodb.MongoClientSettings.Builder builder) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected java.lang.String getDatabaseName() {
        return null;
    }
}