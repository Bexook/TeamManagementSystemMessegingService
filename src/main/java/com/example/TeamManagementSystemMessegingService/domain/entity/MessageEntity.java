package com.example.TeamManagementSystemMessegingService.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "message")
public class MessageEntity {

    @Id
    private Long id;

    @Column(name = "sender_id")
    private Long senderId;

    @Column(name = "receiver_id")
    private Long receiverId;

    @Column(name = "content")
    private String content;

    @Column(name = "send_date_time")
    private LocalDateTime sendDate;

    @Column(name = "read")
    private boolean read;

}
