package com.waterProject.waterShop.dto.response;

import com.waterProject.waterShop.domain.enums.MessageContextType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryServiceMessageDto {
    Long id;
    UserDto recipient;
    UserDto sender;
    String context;
    MessageContextType messageContextType;
    String date;

}
