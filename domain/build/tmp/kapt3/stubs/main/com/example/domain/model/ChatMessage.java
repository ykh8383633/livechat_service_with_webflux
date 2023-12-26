package com.example.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001c"}, d2 = {"Lcom/example/domain/model/ChatMessage;", "", "room", "Lcom/example/domain/model/ChatRoom;", "sender", "Lcom/example/domain/model/ChatUser;", "message", "", "valid", "", "sendDate", "Ljava/time/Instant;", "(Lcom/example/domain/model/ChatRoom;Lcom/example/domain/model/ChatUser;Ljava/lang/String;Ljava/lang/Boolean;Ljava/time/Instant;)V", "getMessage", "()Ljava/lang/String;", "getRoom", "()Lcom/example/domain/model/ChatRoom;", "getSendDate", "()Ljava/time/Instant;", "setSendDate", "(Ljava/time/Instant;)V", "getSender", "()Lcom/example/domain/model/ChatUser;", "getValid", "()Ljava/lang/Boolean;", "setValid", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "domain"})
public final class ChatMessage {
    @org.jetbrains.annotations.NotNull
    private final com.example.domain.model.ChatRoom room = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.domain.model.ChatUser sender = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean valid;
    @org.jetbrains.annotations.NotNull
    private java.time.Instant sendDate;
    
    public ChatMessage(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatRoom room, @org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatUser sender, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    java.lang.Boolean valid, @org.jetbrains.annotations.NotNull
    java.time.Instant sendDate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.model.ChatRoom getRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.model.ChatUser getSender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getValid() {
        return null;
    }
    
    public final void setValid(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.Instant getSendDate() {
        return null;
    }
    
    public final void setSendDate(@org.jetbrains.annotations.NotNull
    java.time.Instant p0) {
    }
}