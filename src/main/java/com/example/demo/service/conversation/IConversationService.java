package com.example.demo.service.conversation;

import com.example.demo.model.Conversation;
import com.example.demo.model.ConversationDTO;

import java.util.List;

public interface IConversationService<T> {
    T getConversation(ConversationDTO conversationDTO);
    List<T> findConversationsByUser();

}
