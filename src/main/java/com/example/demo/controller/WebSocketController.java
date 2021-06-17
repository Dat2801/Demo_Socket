package com.example.demo.controller;

import com.example.demo.model.Conversation;
import com.example.demo.model.ConversationDTO;
import com.example.demo.model.Message;
import com.example.demo.service.conversation.ConversationService;
import com.example.demo.service.message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@CrossOrigin("*")
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    private MessageService messageService;

    @Autowired
    private ConversationService conversationService;


    public Conversation getConversation(@RequestBody ConversationDTO conversationDTO) {
        return conversationService.getConversation(conversationDTO);
    }

    //    @PostMapping
    @MessageMapping("/message")
    @SendTo("/topic/messenger")
    public List<Message> sendMessage(@RequestBody Message message) {
//            messagingTemplate.convertAndSend("/topic/messenger", "hello");
        message.getIdUser();
        messageService.save(message);
        return messageService.getListMessagesByConversation(message.getIdConversation());
    }
}
