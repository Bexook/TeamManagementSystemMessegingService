package com.example.TeamManagementSystemMessegingService.domain;

import com.example.TeamManagementSystemMessegingService.domain.dto.ChatContentDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Chat {

    @JsonProperty("sender")
    private String sender;
    @JsonProperty("receiver")
    private String receiver;
    @JsonProperty("chatContent")
    private ChatContentDTO chatContentDTO;

}
