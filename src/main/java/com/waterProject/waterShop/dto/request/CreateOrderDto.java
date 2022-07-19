package com.waterProject.waterShop.dto.request;

import com.waterProject.waterShop.domain.enums.PayMethodType;
import com.waterProject.waterShop.dto.response.SelectProductDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateOrderDto {
    Long userId;
    String name;
    String address;
    String phoneNumber;
    PayMethodType payMethodType;
    List<SelectProductDto> products;
}
