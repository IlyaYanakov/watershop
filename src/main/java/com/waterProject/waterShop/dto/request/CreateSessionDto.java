package com.waterProject.waterShop.dto.request;

import com.waterProject.waterShop.domain.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateSessionDto {
    Date loginDate;
    Date logoutDate;
    User user;
    String token;
}
