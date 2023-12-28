package com.example.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006 "}, d2 = {"Lcom/example/domain/model/ChatMessage;", "", "id", "", "room", "Lcom/example/domain/model/ChatRoom;", "sender", "Lcom/example/domain/model/ChatUser;", "message", "valid", "", "sendDate", "Ljava/time/Instant;", "(Ljava/lang/String;Lcom/example/domain/model/ChatRoom;Lcom/example/domain/model/ChatUser;Ljava/lang/String;Ljava/lang/Boolean;Ljava/time/Instant;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getMessage", "getRoom", "()Lcom/example/domain/model/ChatRoom;", "getSendDate", "()Ljava/time/Instant;", "setSendDate", "(Ljava/time/Instant;)V", "getSender", "()Lcom/example/domain/model/ChatUser;", "getValid", "()Ljava/lang/Boolean;", "setValid", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "domain"})
public final class ChatMessage {
    @org.jetbrains.annotations.Nullable
    private java.lang.String id;
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
    
    public ChatMessage(@org.jetbrains.annotations.Nullable
    java.lang.String id, @org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatRoom room, @org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatUser sender, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    java.lang.Boolean valid, @org.jetbrains.annotations.NotNull
    java.time.Instant sendDate) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
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