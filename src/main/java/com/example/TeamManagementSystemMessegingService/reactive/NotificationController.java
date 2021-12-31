package com.example.TeamManagementSystemMessegingService.reactive;

import com.example.TeamManagementSystemMessegingService.service.ChangeRequestService;
import com.tms.dao.tmsdao.changeRequestDomain.dto.ChangeRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class NotificationController {

    @Autowired
    private ChangeRequestService changeRequestService;


    @GetMapping("/message/notification")
    public Flux<List<ChangeRequestDTO>> getChat(@RequestPart("id") Long id) {
        return null;
    }


}
