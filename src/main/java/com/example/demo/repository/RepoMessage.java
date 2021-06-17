package com.example.demo.repository;

import com.example.demo.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepoMessage extends JpaRepository<Message, Long> {
//    @Query(value = "select m from Message as m where m.idConversation=: idConversation order by m.id ASC ", nativeQuery = true)
//    public List<Message> getListMessage(Long idConversation);
}
