package entities;

import lombok.Data;

@Data
public class ChatRoom {
    private String id;
    private String chatId;
    private String senderId;
    private String recipientId;
}
