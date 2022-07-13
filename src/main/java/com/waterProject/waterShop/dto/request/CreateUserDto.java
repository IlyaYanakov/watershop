package com.waterProject.waterShop.dto.request;

import com.waterProject.waterShop.domain.enums.UserType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateUserDto {
    Integer cityId;
    UserType userType;
    String fullName;
    String login;
    String password;
    String email;
    String phoneNumber;
}
