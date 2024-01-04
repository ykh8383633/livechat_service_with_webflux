package com.example.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006\""}, d2 = {"Lcom/example/domain/model/Alert;", "", "message", "", "room", "Lcom/example/domain/model/ChatRoom;", "toAll", "", "targetUser", "", "Lcom/example/domain/model/ChatUser;", "type", "Lcom/example/domain/enums/AlertType;", "(Ljava/lang/String;Lcom/example/domain/model/ChatRoom;ZLjava/util/List;Lcom/example/domain/enums/AlertType;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getRoom", "()Lcom/example/domain/model/ChatRoom;", "setRoom", "(Lcom/example/domain/model/ChatRoom;)V", "getTargetUser", "()Ljava/util/List;", "setTargetUser", "(Ljava/util/List;)V", "getToAll", "()Z", "setToAll", "(Z)V", "getType", "()Lcom/example/domain/enums/AlertType;", "setType", "(Lcom/example/domain/enums/AlertType;)V", "domain"})
public final class Alert {
    @org.jetbrains.annotations.Nullable
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable
    private com.example.domain.model.ChatRoom room;
    private boolean toAll;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.domain.model.ChatUser> targetUser;
    @org.jetbrains.annotations.NotNull
    private com.example.domain.enums.AlertType type;
    
    public Alert(@org.jetbrains.annotations.Nullable
    java.lang.String message, @org.jetbrains.annotations.Nullable
    com.example.domain.model.ChatRoom room, boolean toAll, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.domain.model.ChatUser> targetUser, @org.jetbrains.annotations.NotNull
    com.example.domain.enums.AlertType type) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.domain.model.ChatRoom getRoom() {
        return null;
    }
    
    public final void setRoom(@org.jetbrains.annotations.Nullable
    com.example.domain.model.ChatRoom p0) {
    }
    
    public final boolean getToAll() {
        return false;
    }
    
    public final void setToAll(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.domain.model.ChatUser> getTargetUser() {
        return null;
    }
    
    public final void setTargetUser(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.domain.model.ChatUser> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.domain.enums.AlertType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.NotNull
    com.example.domain.enums.AlertType p0) {
    }
    
    public Alert() {
        super();
    }
}