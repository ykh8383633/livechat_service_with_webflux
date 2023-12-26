package com.example.message.config;

@org.springframework.context.annotation.Configuration
@org.springframework.boot.context.properties.EnableConfigurationProperties(value = {com.example.message.config.properties.MessageProperties.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0016J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tH\u0017J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000bH\u0017J(\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/message/config/KafkaConfig;", "", "messageProps", "Lcom/example/message/config/properties/MessageProperties;", "(Lcom/example/message/config/properties/MessageProperties;)V", "getKafkaConfigBase", "", "", "kafkaConsumerFactory", "Lorg/springframework/kafka/core/ConsumerFactory;", "kafkaProducerFactory", "Lorg/springframework/kafka/core/ProducerFactory;", "reactiveKafkaProducerTemplate", "Lorg/springframework/kafka/core/reactive/ReactiveKafkaProducerTemplate;", "producerFactory", "message"})
public class KafkaConfig {
    @org.jetbrains.annotations.NotNull
    private final com.example.message.config.properties.MessageProperties messageProps = null;
    
    public KafkaConfig(@org.jetbrains.annotations.NotNull
    com.example.message.config.properties.MessageProperties messageProps) {
        super();
    }
    
    @org.springframework.context.annotation.Bean
    @org.jetbrains.annotations.NotNull
    public org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate<java.lang.String, java.lang.String> reactiveKafkaProducerTemplate(@org.jetbrains.annotations.NotNull
    org.springframework.kafka.core.ProducerFactory<java.lang.String, java.lang.String> producerFactory) {
        return null;
    }
    
    @org.springframework.context.annotation.Bean
    @org.jetbrains.annotations.NotNull
    public org.springframework.kafka.core.ProducerFactory<java.lang.String, java.lang.String> kafkaProducerFactory() {
        return null;
    }
    
    @org.springframework.context.annotation.Bean
    @org.jetbrains.annotations.NotNull
    public org.springframework.kafka.core.ConsumerFactory<java.lang.String, java.lang.String> kafkaConsumerFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.Map<java.lang.String, java.lang.Object> getKafkaConfigBase() {
        return null;
    }
}