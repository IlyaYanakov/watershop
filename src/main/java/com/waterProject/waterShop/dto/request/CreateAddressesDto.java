package com.waterProject.waterShop.dto.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

public class CreateAddressesDto {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @FieldDefaults(level = AccessLevel.PRIVATE)
    public class CreateAddressDto {
        String latitude;
        String longitude;
        Long cityId;
        String street;
        String house;
        String flat;
        boolean elevator;
        Long userId;
    }
}
