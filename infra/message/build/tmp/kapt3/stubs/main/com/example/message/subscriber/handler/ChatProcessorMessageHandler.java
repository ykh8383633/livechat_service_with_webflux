package com.example.message.subscriber.handler;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\b\u0010\u001f\u001a\u00020\u0004H\u0014J\b\u0010 \u001a\u00020\u0004H\u0014J\b\u0010!\u001a\u00020\u0004H\u0014J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001cH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0004X\u0085\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000bX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012\u00a8\u0006%"}, d2 = {"Lcom/example/message/subscriber/handler/ChatProcessorMessageHandler;", "Lcom/example/message/subscriber/handler/MessageHandler;", "()V", "_publishChannel", "Lcom/example/message/channel/Channel;", "_subscribedChannel", "allChannels", "", "getAllChannels", "()Ljava/util/List;", "lastStep", "", "getLastStep", "()I", "processStep", "getProcessStep", "publishChannel", "getPublishChannel", "()Lcom/example/message/channel/Channel;", "publisher", "Lcom/example/message/publisher/Publisher;", "getPublisher", "()Lcom/example/message/publisher/Publisher;", "subscribedChannel", "getSubscribedChannel", "doNextStep", "", "nextMessage", "", "getChannelName", "stepNum", "getLastStepChannel", "getPubChannel", "getSubChannel", "jumpToLastStep", "parseChannel", "channelName", "message"})
public abstract class ChatProcessorMessageHandler implements com.example.message.subscriber.handler.MessageHandler {
    @org.jetbrains.annotations.Nullable
    private com.example.message.channel.Channel _subscribedChannel;
    @org.jetbrains.annotations.Nullable
    private com.example.message.channel.Channel _publishChannel;
    @org.springframework.beans.factory.annotation.Autowired
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.message.channel.Channel> allChannels = null;
    
    public ChatProcessorMessageHandler() {
        super();
    }
    
    protected abstract int getProcessStep();
    
    protected abstract int getLastStep();
    
    @org.jetbrains.annotations.NotNull
    protected abstract com.example.message.publisher.Publisher getPublisher();
    
    @org.jetbrains.annotations.NotNull
    protected final java.util.List<com.example.message.channel.Channel> getAllChannels() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.message.channel.Channel getSubscribedChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.message.channel.Channel getPublishChannel() {
        return null;
    }
    
    public void doNextStep(@org.jetbrains.annotations.NotNull
    java.lang.String nextMessage) {
    }
    
    public void jumpToLastStep(@org.jetbrains.annotations.NotNull
    java.lang.String nextMessage) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected com.example.message.channel.Channel getSubChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected com.example.message.channel.Channel getPubChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected com.example.message.channel.Channel getLastStepChannel() {
        return null;
    }
    
    private final com.example.message.channel.Channel parseChannel(java.lang.String channelName) {
        return null;
    }
    
    private final java.lang.String getChannelName(int stepNum) {
        return null;
    }
}