package com.example.saveChatProcessor.handlers;

@org.springframework.stereotype.Component
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/example/saveChatProcessor/handlers/SaveChatHandler;", "Lcom/example/message/subscriber/handler/MessageHandler;", "publisher", "Lcom/example/message/publisher/Publisher;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "subscribedChannel", "Lcom/example/message/channel/DoneRecentChatProcessChannel;", "pubChannel", "Lcom/example/message/channel/OutMessageChannel;", "chatMessageCommand", "Lcom/example/persistence/repository/chat/command/ChatMessageCommand;", "(Lcom/example/message/publisher/Publisher;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/example/message/channel/DoneRecentChatProcessChannel;Lcom/example/message/channel/OutMessageChannel;Lcom/example/persistence/repository/chat/command/ChatMessageCommand;)V", "getSubscribedChannel", "()Lcom/example/message/channel/DoneRecentChatProcessChannel;", "handle", "", "message", "", "saveChatProcessor"})
public class SaveChatHandler implements com.example.message.subscriber.handler.MessageHandler {
    @org.jetbrains.annotations.NotNull
    private final com.example.message.publisher.Publisher publisher = null;
    @org.jetbrains.annotations.NotNull
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.message.channel.DoneRecentChatProcessChannel subscribedChannel = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.message.channel.OutMessageChannel pubChannel = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.persistence.repository.chat.command.ChatMessageCommand chatMessageCommand = null;
    
    public SaveChatHandler(@org.jetbrains.annotations.NotNull
    com.example.message.publisher.Publisher publisher, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper, @org.jetbrains.annotations.NotNull
    com.example.message.channel.DoneRecentChatProcessChannel subscribedChannel, @org.jetbrains.annotations.NotNull
    com.example.message.channel.OutMessageChannel pubChannel, @org.jetbrains.annotations.NotNull
    com.example.persistence.repository.chat.command.ChatMessageCommand chatMessageCommand) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.message.channel.DoneRecentChatProcessChannel getSubscribedChannel() {
        return null;
    }
    
    @java.lang.Override
    public void handle(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}