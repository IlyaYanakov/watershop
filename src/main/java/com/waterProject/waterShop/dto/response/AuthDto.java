package com.waterProject.waterShop.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AuthDto {
    String login;
    String password;
}
