package com.example.demo.repository.query;

import com.example.demo.model.Conversation;
import com.example.demo.model.ConversationDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ConversationQuery {
    @PersistenceContext
    private EntityManager entityManager;

    public Conversation getConversations(ConversationDTO conversationDTO) {
        StringBuilder sql = new StringBuilder();
        sql.append("select c.id,c.name,c.avatar from Conversation as c " +
                " inner join ChatBox as cbc on c.id = cbc.idConversation " +
                " inner join Users as u on cbc.idUser = u.id " +
                " where c.id = " + conversationDTO.getIdUser() +
                " and u.id = " + conversationDTO.getIdConversation());
        return Conversation.class.cast(entityManager.createNativeQuery(sql.toString()).getSingleResult());
    }


}
