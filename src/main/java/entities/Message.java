package entities;

import lombok.Data;

import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Data
public class Message {
        @Id
        private UUID id;
        private String chatId;
        private String senderId;
        private String recipientId;
        private String senderName;
        private String recipientName;
        private String content;
        private Date timestamp;
        private MessageStatus status;
}
