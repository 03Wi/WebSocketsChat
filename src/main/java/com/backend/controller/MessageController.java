package com.backend.controller;

import com.backend.model.MessageRequest;
import com.backend.model.MessageResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/message")
    private MessageResponse getMessageResponse(MessageRequest message) {
        return new MessageResponse("This is the message" + message.getMessage());

    }
}
