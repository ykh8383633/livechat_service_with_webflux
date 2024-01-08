package com.example.spamProcessor.handlers;

@org.springframework.stereotype.Component
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0012J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000b\u001a\u00020\nX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lcom/example/spamProcessor/handlers/SpamChatHandler;", "Lcom/example/message/subscriber/handler/ChatProcessorMessageHandler;", "publisher", "Lcom/example/message/publisher/Publisher;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "allChannels", "", "Lcom/example/message/channel/Channel;", "processStep", "", "lastStep", "(Lcom/example/message/publisher/Publisher;Lcom/fasterxml/jackson/databind/ObjectMapper;Ljava/util/List;II)V", "getAllChannels", "()Ljava/util/List;", "getLastStep", "()I", "getProcessStep", "getPublisher", "()Lcom/example/message/publisher/Publisher;", "checkMessage", "", "chat", "Lcom/example/domain/model/ChatMessage;", "handle", "", "message", "", "spamProcessor"})
public class SpamChatHandler extends com.example.message.subscriber.handler.ChatProcessorMessageHandler {
    @org.jetbrains.annotations.NotNull
    private final com.example.message.publisher.Publisher publisher = null;
    @org.jetbrains.annotations.NotNull
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.message.channel.Channel> allChannels = null;
    private final int processStep = 0;
    private final int lastStep = 0;
    
    public SpamChatHandler(@org.jetbrains.annotations.NotNull
    com.example.message.publisher.Publisher publisher, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.message.channel.Channel> allChannels, @org.springframework.beans.factory.annotation.Value(value = "${spring.chat.processor.step}")
    int processStep, @org.springframework.beans.factory.annotation.Value(value = "${spring.chat.processor.lastStep}")
    int lastStep) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected com.example.message.publisher.Publisher getPublisher() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected java.util.List<com.example.message.channel.Channel> getAllChannels() {
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
    public void handle(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    private boolean checkMessage(com.example.domain.model.ChatMessage chat) {
        return false;
    }
}