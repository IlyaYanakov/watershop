package com.waterProject.waterShop.dto.response;

import com.waterProject.waterShop.domain.enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MessagesDto {
    Integer fromId;
    Integer toId;
    String content;
    MessageType contentType;
}
