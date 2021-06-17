package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class ConversationDTO {
    private String idUser;
    private String idConversation;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(String idConversation) {
        this.idConversation = idConversation;
    }


}
