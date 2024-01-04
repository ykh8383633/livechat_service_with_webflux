package com.example.persistence.entity;

@org.springframework.data.mongodb.core.mapping.Document(collation = "chat_user")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/persistence/entity/UserEntity;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "muteStartTime", "Ljava/time/Instant;", "getMuteStartTime", "()Ljava/time/Instant;", "setMuteStartTime", "(Ljava/time/Instant;)V", "type", "getType", "setType", "persistence"})
public final class UserEntity {
    @org.springframework.data.annotation.Id
    @org.jetbrains.annotations.Nullable
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable
    private java.time.Instant muteStartTime;
    
    public UserEntity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.Instant getMuteStartTime() {
        return null;
    }
    
    public final void setMuteStartTime(@org.jetbrains.annotations.Nullable
    java.time.Instant p0) {
    }
}