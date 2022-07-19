package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.response.SecurityAuthDto;

public interface SecurityAuthBuilder {
    SecurityAuthDto build(User user);
}
