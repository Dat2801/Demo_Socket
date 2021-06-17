package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @Column(name = "id_conversation")
    private Long idConversation;

    @Column(name = "id_user")
    private Long idUser;

    public Message() {
    }

    public Message(String content) {
        this.content = content;
    }

    public Message(String content, Long idConversation) {
        this.content = content;
        this.idConversation = idConversation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getIdConversation() {
        return idConversation;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public void setIdConversation(Long idConversation) {
        this.idConversation = idConversation;
    }
}
