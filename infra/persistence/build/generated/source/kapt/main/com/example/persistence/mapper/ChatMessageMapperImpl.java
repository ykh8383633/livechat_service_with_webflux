package com.example.persistence.mapper;

import com.example.domain.model.ChatMessage;
import com.example.domain.model.ChatRoom;
import com.example.domain.model.ChatUser;
import com.example.persistence.entity.ChatMessageEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-05T01:20:44+0900",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.8.22.jar, environment: Java 17.0.5 (Oracle Corporation)"
)
public class ChatMessageMapperImpl implements ChatMessageMapper {

    @Override
    public ChatMessageEntity toEntity(ChatMessage chat) {
        if ( chat == null ) {
            return null;
        }

        ChatMessageEntity chatMessageEntity = new ChatMessageEntity();

        chatMessageEntity.setRoomId( chatRoomRoomId( chat ) );
        chatMessageEntity.setSenderId( chatSenderUserId( chat ) );
        chatMessageEntity.setId( chat.getId() );
        chatMessageEntity.setMessage( chat.getMessage() );
        chatMessageEntity.setValid( chat.getValid() );
        chatMessageEntity.setSendDate( chat.getSendDate() );

        return chatMessageEntity;
    }

    private String chatRoomRoomId(ChatMessage chatMessage) {
        if ( chatMessage == null ) {
            return null;
        }
        ChatRoom room = chatMessage.getRoom();
        if ( room == null ) {
            return null;
        }
        String roomId = room.getRoomId();
        if ( roomId == null ) {
            return null;
        }
        return roomId;
    }

    private String chatSenderUserId(ChatMessage chatMessage) {
        if ( chatMessage == null ) {
            return null;
        }
        ChatUser sender = chatMessage.getSender();
        if ( sender == null ) {
            return null;
        }
        String userId = sender.getUserId();
        if ( userId == null ) {
            return null;
        }
        return userId;
    }
}
