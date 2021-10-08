package com.example.TeamManagementSystemMessegingService.service;

import com.example.TeamManagementSystemMessegingService.domain.Chat;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MessageService {

    List<Chat> getChatPageable(Pageable pageable, Long senderId);





}
