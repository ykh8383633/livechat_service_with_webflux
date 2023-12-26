package com.example.message.publisher;

@org.springframework.stereotype.Component
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/message/publisher/Producer;", "Lcom/example/message/publisher/Publisher;", "producerTemplate", "Lorg/springframework/kafka/core/reactive/ReactiveKafkaProducerTemplate;", "", "(Lorg/springframework/kafka/core/reactive/ReactiveKafkaProducerTemplate;)V", "publish", "", "topic", "message", "key"})
public class Producer implements com.example.message.publisher.Publisher {
    @org.jetbrains.annotations.NotNull
    private final org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate<java.lang.String, java.lang.String> producerTemplate = null;
    
    public Producer(@org.jetbrains.annotations.NotNull
    org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate<java.lang.String, java.lang.String> producerTemplate) {
        super();
    }
    
    @java.lang.Override
    public void publish(@org.jetbrains.annotations.NotNull
    java.lang.String topic, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @java.lang.Override
    public void publish(@org.jetbrains.annotations.NotNull
    java.lang.String topic, @org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}