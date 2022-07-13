package com.waterProject.waterShop.service;

import com.waterProject.waterShop.dto.request.CreateMessageDto;

import java.util.List;

public interface MessageService {

    MessageService create (CreateMessageDto request);

    List<MessageService> getAll();

    void delete (Long id);

    void update(Long id, CreateMessageDto request);
}
