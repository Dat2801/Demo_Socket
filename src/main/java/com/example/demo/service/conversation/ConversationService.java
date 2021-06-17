package com.example.demo.service.conversation;

import com.example.demo.model.Conversation;
import com.example.demo.model.ConversationDTO;
import com.example.demo.repository.RepoConversation;
import com.example.demo.repository.query.ConversationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConversationService implements IConversationService<Conversation> {

    @Autowired
    private RepoConversation repoConversation;

    @Autowired
    private ConversationQuery conversationQuery;

    @Override
    public Conversation getConversation(ConversationDTO conversationDTO) {
        return conversationQuery.getConversations(conversationDTO);
    }

    @Override
    public List<Conversation> findConversationsByUser() {
        return null;
    }
}
