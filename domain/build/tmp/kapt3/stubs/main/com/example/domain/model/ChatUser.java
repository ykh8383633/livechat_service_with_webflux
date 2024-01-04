package com.example.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u0005R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006 "}, d2 = {"Lcom/example/domain/model/ChatUser;", "", "session", "Lorg/springframework/web/reactive/socket/WebSocketSession;", "userId", "", "type", "Lcom/example/domain/enums/UserType;", "muteStartTime", "Ljava/time/Instant;", "(Lorg/springframework/web/reactive/socket/WebSocketSession;Ljava/lang/String;Lcom/example/domain/enums/UserType;Ljava/time/Instant;)V", "isMuteUser", "", "()Z", "getMuteStartTime", "()Ljava/time/Instant;", "setMuteStartTime", "(Ljava/time/Instant;)V", "getSession", "()Lorg/springframework/web/reactive/socket/WebSocketSession;", "setSession", "(Lorg/springframework/web/reactive/socket/WebSocketSession;)V", "getType", "()Lcom/example/domain/enums/UserType;", "setType", "(Lcom/example/domain/enums/UserType;)V", "getUserId", "()Ljava/lang/String;", "sendMessage", "", "sender", "message", "domain"})
public final class ChatUser {
    @com.fasterxml.jackson.annotation.JsonIgnore
    @org.jetbrains.annotations.Nullable
    private org.springframework.web.reactive.socket.WebSocketSession session;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull
    private com.example.domain.enums.UserType type;
    @org.jetbrains.annotations.Nullable
    private java.time.Instant muteStartTime;
    private final boolean isMuteUser = false;
    
    public ChatUser(@org.jetbrains.annotations.Nullable
    org.springframework.web.reactive.socket.WebSocketSession session, @org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    com.example.domain.enums.UserType type, @org.jetbrains.annotations.Nullable
    java.time.Instant muteStartTime) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.springframework.web.reactive.socket.WebSocketSession getSession() {
        return null;
    }
    
    public final void setSession(@org.jetbrains.annotations.Nullable
    org.springframework.web.reactive.socket.WebSocketSession p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.enums.UserType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    com.example.domain.enums.UserType p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.Instant getMuteStartTime() {
        return null;
    }
    
    public final void setMuteStartTime(@org.jetbrains.annotations.Nullable
    java.time.Instant p0) {
    }
    
    public final boolean isMuteUser() {
        return false;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.Nullable
    com.example.domain.model.ChatUser sender, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}