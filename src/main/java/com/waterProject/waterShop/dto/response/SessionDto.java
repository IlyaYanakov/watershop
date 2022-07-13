package com.waterProject.waterShop.dto.response;

import com.waterProject.waterShop.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class SessionDto {
    Date loginDate;
    Date logoutDate;
    User user;
    String token;
}
