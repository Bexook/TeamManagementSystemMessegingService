package com.example.TeamManagementSystemMessegingService.service.impl;

import com.example.TeamManagementSystemMessegingService.domain.Chat;
import com.example.TeamManagementSystemMessegingService.repository.MessageRepository;
import com.example.TeamManagementSystemMessegingService.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {


    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<Chat> getChatPageable(Pageable pageable, Long senderId) {
        return null;
    }
}
