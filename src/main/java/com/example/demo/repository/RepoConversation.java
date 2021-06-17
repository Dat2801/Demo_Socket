package com.example.demo.repository;

import com.example.demo.model.Conversation;
import com.example.demo.model.ConversationDTO;
import org.hibernate.Session;
import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RepoConversation extends JpaRepository<Conversation, Long> {

}
