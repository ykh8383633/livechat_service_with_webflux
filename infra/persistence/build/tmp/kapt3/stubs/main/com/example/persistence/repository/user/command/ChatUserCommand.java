package com.example.persistence.repository.user.command;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/persistence/repository/user/command/ChatUserCommand;", "", "save", "Lreactor/core/publisher/Mono;", "Lcom/example/domain/model/ChatUser;", "user", "update", "persistence"})
public abstract interface ChatUserCommand {
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<com.example.domain.model.ChatUser> save(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatUser user);
    
    @org.jetbrains.annotations.NotNull
    public abstract reactor.core.publisher.Mono<com.example.domain.model.ChatUser> update(@org.jetbrains.annotations.NotNull
    com.example.domain.model.ChatUser user);
}