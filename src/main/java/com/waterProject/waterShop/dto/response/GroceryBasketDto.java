package com.waterProject.waterShop.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroceryBasketDto {
    Long id;
    UserDto user;
    ProductDto product;
}
