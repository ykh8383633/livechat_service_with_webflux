package com.example.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0003J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/domain/model/ChatRoom;", "", "roomId", "", "(Ljava/lang/String;)V", "getRoomId", "()Ljava/lang/String;", "users", "", "Lcom/example/domain/model/ChatUser;", "broadCast", "", "senderId", "message", "findUser", "userId", "registerUser", "user", "domain"})
public final class ChatRoom {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String roomId = null;
    @com.fasterxml.jackson.annotation.JsonIgnore
    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.example.domain.model.ChatUser> users = null;
    
    public ChatRoom(@org.jetbrains.annotations.NotNull
    java.lang.String roomId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoomId() {
        return null;
    }
    
    public final void registerUser(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatUser user) {
    }
    
    public final void broadCast(@org.jetbrains.annotations.NotNull
    java.lang.String senderId, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.domain.model.ChatUser findUser(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return null;
    }
}