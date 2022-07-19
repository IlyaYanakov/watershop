package com.waterProject.waterShop.dto.response;

import com.waterProject.waterShop.domain.enums.PayMethodType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    Long id;
    UserDto user;
    String name;
    String address;
    String phoneNumber;
    PayMethodType payMethodType;
    List<SelectProductDto> products;
}
