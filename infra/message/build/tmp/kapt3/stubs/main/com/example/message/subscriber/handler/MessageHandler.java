package com.example.message.subscriber.handler;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\b"}, d2 = {"Lcom/example/message/subscriber/handler/MessageHandler;", "", "subscribedChannel", "Lcom/example/message/channel/Channel;", "getSubscribedChannel", "()Lcom/example/message/channel/Channel;", "handle", "", "message", ""})
public abstract interface MessageHandler {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.message.channel.Channel getSubscribedChannel();
    
    public abstract void handle(@org.jetbrains.annotations.NotNull
    java.lang.String message);
}