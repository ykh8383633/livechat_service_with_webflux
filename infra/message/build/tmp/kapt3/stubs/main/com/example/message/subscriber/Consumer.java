package com.example.message.subscriber;

@org.springframework.stereotype.Component
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\'\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0011H\u0012J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fH\u0012R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fX\u0092\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0011X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/message/subscriber/Consumer;", "Lcom/example/message/subscriber/Subscriber;", "kafkaConsumerFactory", "Lorg/springframework/kafka/core/ConsumerFactory;", "", "handlers", "", "Lcom/example/message/subscriber/handler/MessageHandler;", "(Lorg/springframework/kafka/core/ConsumerFactory;Ljava/util/List;)V", "channels", "", "Lcom/example/message/channel/Channel;", "getChannels", "()Ljava/util/Set;", "consumerTemplate", "Lorg/springframework/kafka/core/reactive/ReactiveKafkaConsumerTemplate;", "handlerMap", "", "initHandlers", "reactiveKafkaConsumerTemplate", "message"})
public class Consumer implements com.example.message.subscriber.Subscriber {
    @org.jetbrains.annotations.NotNull
    private final org.springframework.kafka.core.ConsumerFactory<java.lang.String, java.lang.String> kafkaConsumerFactory = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.message.subscriber.handler.MessageHandler> handlers = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.example.message.channel.Channel> channels = null;
    @org.jetbrains.annotations.NotNull
    private final org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate<java.lang.String, java.lang.String> consumerTemplate = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.util.List<com.example.message.subscriber.handler.MessageHandler>> handlerMap = null;
    
    public Consumer(@org.jetbrains.annotations.NotNull
    org.springframework.kafka.core.ConsumerFactory<java.lang.String, java.lang.String> kafkaConsumerFactory, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.message.subscriber.handler.MessageHandler> handlers) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.Set<com.example.message.channel.Channel> getChannels() {
        return null;
    }
    
    private org.springframework.kafka.core.reactive.ReactiveKafkaConsumerTemplate<java.lang.String, java.lang.String> reactiveKafkaConsumerTemplate() {
        return null;
    }
    
    private java.util.Map<java.lang.String, java.util.List<com.example.message.subscriber.handler.MessageHandler>> initHandlers() {
        return null;
    }
}