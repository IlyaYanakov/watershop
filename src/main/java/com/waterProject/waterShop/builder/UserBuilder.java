package com.waterProject.waterShop.builder;

import com.waterProject.waterShop.domain.Address;
import com.waterProject.waterShop.domain.City;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateUserDto;
import com.waterProject.waterShop.dto.response.RegistrationDto;
import com.waterProject.waterShop.dto.response.UserDto;

public interface UserBuilder {
    UserDto build(User user);

    User build(CreateUserDto request,
               City city,
               Address address);

    void update(User user,
                CreateUserDto request,
                City city,
                Address address);

    User regBuild(RegistrationDto request);
}
