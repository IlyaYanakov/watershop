package com.waterProject.waterShop.controller.base;

import com.waterProject.waterShop.service.impl.TokenHelper;
import lombok.Setter;

import javax.servlet.http.HttpServletRequest;

@Setter
public class AuthorizationController {

    protected Long userId;

    public AuthorizationController(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        setUserId(TokenHelper.parseJwt(token));
    }
}
