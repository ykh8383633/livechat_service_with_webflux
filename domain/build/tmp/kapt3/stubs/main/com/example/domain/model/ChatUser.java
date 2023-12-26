package com.example.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/domain/model/ChatUser;", "", "session", "Lorg/springframework/web/reactive/socket/WebSocketSession;", "userId", "", "(Lorg/springframework/web/reactive/socket/WebSocketSession;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "getSession", "()Lorg/springframework/web/reactive/socket/WebSocketSession;", "setSession", "(Lorg/springframework/web/reactive/socket/WebSocketSession;)V", "getUserId", "()Ljava/lang/String;", "sendMessage", "", "sender", "message", "domain"})
public final class ChatUser {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userId = null;
    @com.fasterxml.jackson.annotation.JsonIgnore
    @org.jetbrains.annotations.Nullable
    private org.springframework.web.reactive.socket.WebSocketSession session;
    
    public ChatUser(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.springframework.web.reactive.socket.WebSocketSession getSession() {
        return null;
    }
    
    public final void setSession(@org.jetbrains.annotations.Nullable
    org.springframework.web.reactive.socket.WebSocketSession p0) {
    }
    
    public ChatUser(@org.jetbrains.annotations.NotNull
    org.springframework.web.reactive.socket.WebSocketSession session, @org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        super();
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatUser sender, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}