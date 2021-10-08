package com.example.TeamManagementSystemMessegingService.domain.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageDTO {

    private Long id;
    private Long senderId;
    private Long receiverId;
    private String content;
    private LocalDateTime sendDate;
    private boolean read;

}
