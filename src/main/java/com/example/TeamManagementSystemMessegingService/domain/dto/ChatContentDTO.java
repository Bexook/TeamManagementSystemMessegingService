package com.example.TeamManagementSystemMessegingService.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;

@Data
@JsonPropertyOrder({"senderMessages", "receiverMessage", "sender", "receiver"})
public class ChatContentDTO {

    @JsonProperty("senderMessages")
    private List<MessageDTO> senderMessages;
    @JsonProperty("receiverMessages")
    private List<MessageDTO> receiverMessages;

}
