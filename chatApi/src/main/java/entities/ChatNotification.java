package entities;

import lombok.Data;

import javax.persistence.Id;
import java.util.UUID;

@Data
public class ChatNotification {
    @Id
    private UUID id;
    private String senderId;
    private String senderName;
}
