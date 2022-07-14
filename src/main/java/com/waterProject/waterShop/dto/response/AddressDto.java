package com.waterProject.waterShop.dto.response;

import com.waterProject.waterShop.domain.User;
import liquibase.pro.packaged.A;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AddressDto {
    Long id;
    Float latitude;
    Float longitude;
    CityDto city;
    String street;
    String house;
    String floor;
    User user;
    Integer level;
    boolean elevator;
}
