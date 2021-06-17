package com.example.demo.repository.query;

import com.example.demo.model.Message;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class MessageQuery {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Message> getListMessages(Long idConversation) {
        StringBuilder sql = new StringBuilder();
        sql.append("from Message where id_conversation = " + idConversation + " order by id asc");
        return entityManager.createQuery(sql.toString()).getResultList();
    }
}
