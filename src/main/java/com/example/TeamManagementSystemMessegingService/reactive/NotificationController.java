package com.example.TeamManagementSystemMessegingService.reactive;

import com.example.TeamManagementSystemMessegingService.domain.Chat;
import com.example.TeamManagementSystemMessegingService.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class NotificationController {


    @Autowired
    private MessageService messageService;

    @GetMapping("/message/chat")
    public Flux<List<Chat>> getChat(@RequestPart("id") Long id) {
        return null;
    }

}
