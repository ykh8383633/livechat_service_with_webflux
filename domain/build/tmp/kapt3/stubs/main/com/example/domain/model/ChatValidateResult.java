package com.example.domain.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/example/domain/model/ChatValidateResult;", "", "valid", "", "chat", "Lcom/example/domain/model/ChatMessage;", "reason", "", "(ZLcom/example/domain/model/ChatMessage;Ljava/lang/String;)V", "getChat", "()Lcom/example/domain/model/ChatMessage;", "setChat", "(Lcom/example/domain/model/ChatMessage;)V", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "getValid", "()Z", "setValid", "(Z)V", "domain"})
public final class ChatValidateResult {
    private boolean valid;
    @org.jetbrains.annotations.Nullable
    private com.example.domain.model.ChatMessage chat;
    @org.jetbrains.annotations.Nullable
    private java.lang.String reason;
    
    public ChatValidateResult(boolean valid, @org.jetbrains.annotations.Nullable
    com.example.domain.model.ChatMessage chat, @org.jetbrains.annotations.Nullable
    java.lang.String reason) {
        super();
    }
    
    public final boolean getValid() {
        return false;
    }
    
    public final void setValid(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.domain.model.ChatMessage getChat() {
        return null;
    }
    
    public final void setChat(@org.jetbrains.annotations.Nullable
    com.example.domain.model.ChatMessage p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReason() {
        return null;
    }
    
    public final void setReason(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public ChatValidateResult() {
        super();
    }
}