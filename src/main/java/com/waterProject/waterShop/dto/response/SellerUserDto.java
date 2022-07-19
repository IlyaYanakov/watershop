package com.waterProject.waterShop.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SellerUserDto {
    Long id;
    SellerDto seller;
    UserDto user;
}
