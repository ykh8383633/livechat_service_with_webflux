package com.example.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/domain/model/ChatRoom;", "", "roomId", "", "(Ljava/lang/String;)V", "allowTooMuchChatter", "", "getAllowTooMuchChatter", "()Z", "getRoomId", "()Ljava/lang/String;", "users", "", "Lcom/example/domain/model/ChatUser;", "broadCast", "", "senderId", "message", "deleteUser", "userId", "findUser", "registerUser", "user", "domain"})
public final class ChatRoom {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String roomId = null;
    @com.fasterxml.jackson.annotation.JsonIgnore
    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.example.domain.model.ChatUser> users = null;
    private final boolean allowTooMuchChatter = false;
    
    public ChatRoom(@org.jetbrains.annotations.NotNull
    java.lang.String roomId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoomId() {
        return null;
    }
    
    public final boolean getAllowTooMuchChatter() {
        return false;
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
    
    public final boolean deleteUser(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return false;
    }
}