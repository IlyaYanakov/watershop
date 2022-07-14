package com.waterProject.waterShop.dto.request;

import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.response.CityDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateAddressDto {
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
