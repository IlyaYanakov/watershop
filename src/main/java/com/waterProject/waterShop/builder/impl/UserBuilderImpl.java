package com.waterProject.waterShop.builder.impl;

import com.waterProject.waterShop.builder.AddressBuilder;
import com.waterProject.waterShop.builder.CityBuilder;
import com.waterProject.waterShop.builder.UserBuilder;
import com.waterProject.waterShop.domain.Address;
import com.waterProject.waterShop.domain.City;
import com.waterProject.waterShop.domain.User;
import com.waterProject.waterShop.dto.request.CreateUserDto;
import com.waterProject.waterShop.dto.response.RegistrationDto;
import com.waterProject.waterShop.dto.response.UserDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.util.Date;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor

public class UserBuilderImpl implements UserBuilder {

    CityBuilder cityBuilder;
    AddressBuilder addressBuilder;

    @Override
    public UserDto build(User user) {
        return UserDto.builder()
                .id(user.getId())
                .type(user.getType())
                .fullName(user.getFullName())
                .login(user.getLogin())
                .password(user.getPassword())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
               // .city(cityBuilder.build(user.getCity()))
                //.address(addressBuilder.build(user.getAddress()))
                .build();
    }

    @Override
    public User build(CreateUserDto request, City city, Address address) {
        User user = new User();
        user.setType(request.getUserType());
        user.setFullName(request.getFullName());
        user.setLogin(request.getLogin());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setCity(city);
        user.setAddress(address);
        user.setCreatedAt(new Date());
        return user;
    }

    @Override
    public void update(User user, CreateUserDto request, City city, Address address) {
        user.setType(request.getUserType());
        user.setFullName(request.getFullName());
        user.setLogin(request.getLogin());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setCity(city);
        user.setAddress(address);
        user.setUpdatedAt(new Date());
    }

    @Override
    public User regBuild(RegistrationDto request) {
        User user = new User();
        user.setPassword(DigestUtils.md5DigestAsHex(request.getPassword().getBytes()));
        user.setLogin(request.getLogin());
        user.setCreatedAt(new Date());
        return user;
    }
}
