package com.example.persistence.mapper;

import com.example.domain.enums.UserType;
import com.example.domain.model.ChatUser;
import com.example.persistence.entity.UserEntity;
import java.time.Instant;
import javax.annotation.processing.Generated;
import org.springframework.web.reactive.socket.WebSocketSession;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-19T22:10:33+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.8.22.jar, environment: Java 17.0.5 (Oracle Corporation)"
)
public class ChatUserMapperImpl implements ChatUserMapper {

    @Override
    public UserEntity toEntity(ChatUser user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( user.getUserId() );
        userEntity.setType( userTypeTypeString( user ) );
        userEntity.setMuteStartTime( user.getMuteStartTime() );

        return userEntity;
    }

    @Override
    public ChatUser toDomain(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String userId = null;
        Instant muteStartTime = null;

        userId = entity.getId();
        muteStartTime = entity.getMuteStartTime();

        UserType type = UserType.parse(entity.getType());
        WebSocketSession session = null;

        ChatUser chatUser = new ChatUser( session, userId, type, muteStartTime );

        return chatUser;
    }

    private String userTypeTypeString(ChatUser chatUser) {
        if ( chatUser == null ) {
            return null;
        }
        UserType type = chatUser.getType();
        if ( type == null ) {
            return null;
        }
        String typeString = type.getTypeString();
        if ( typeString == null ) {
            return null;
        }
        return typeString;
    }
}
