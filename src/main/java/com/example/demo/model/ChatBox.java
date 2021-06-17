package com.example.demo.model;

import javax.persistence.*;

@Entity
public class ChatBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "id_conversation")
    private Long idConversation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(Long idConversation) {
        this.idConversation = idConversation;
    }
}
