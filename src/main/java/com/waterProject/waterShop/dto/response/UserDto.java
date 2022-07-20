package com.waterProject.waterShop.dto.response;

import com.waterProject.waterShop.domain.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    Long id;
    UserType type;
    String fullName;
    String login;
    String password;
//    String email;
    String phoneNumber;
//    CityDto city;
//    AddressDto address;
}
