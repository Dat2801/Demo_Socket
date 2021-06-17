package com.example.demo.service.message;

import com.example.demo.model.Message;
import com.example.demo.repository.RepoMessage;
import com.example.demo.repository.query.ConversationQuery;
import com.example.demo.repository.query.MessageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService implements IMessageService<Message> {

    @Autowired
    private MessageQuery messageQuery;


    @Autowired
    private RepoMessage repoMessage;

    @Override
    public List<Message> getListMessagesByConversation(Long idConversation) {
        return messageQuery.getListMessages(idConversation);
    }

    @Override
    public Message save(Message message) {
        return repoMessage.save(message);
    }


}
