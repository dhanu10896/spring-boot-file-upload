package com.fullstackwebapp.springbootfileupload.controller;

import com.fullstackwebapp.springbootfileupload.model.Message;
import com.fullstackwebapp.springbootfileupload.model.MessageResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/message")
    public MessageResponse getMessage(Message message) {
        return new MessageResponse("Hello, " + message.getName());
    }
}
