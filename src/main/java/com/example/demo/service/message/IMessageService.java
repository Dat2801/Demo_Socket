package com.example.demo.service.message;

import com.example.demo.model.Message;

import java.util.List;

public interface IMessageService<T> {
    List<T> getListMessagesByConversation(Long idConversation);

    T save(T t);
}
