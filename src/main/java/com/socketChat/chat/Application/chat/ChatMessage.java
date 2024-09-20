package com.socketChat.chat.Application.chat;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;
}
