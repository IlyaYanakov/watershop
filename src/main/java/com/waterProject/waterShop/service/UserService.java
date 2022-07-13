package com.waterProject.waterShop.service;

import com.waterProject.waterShop.dto.request.CreateUserDto;
import com.waterProject.waterShop.dto.response.SessionDto;
import com.waterProject.waterShop.dto.response.UserDto;

import java.util.List;

public interface UserService  {
    SessionDto registration(String login, String password);

    UserDto registration(String fullName,
                         String password,
                         String email,
                         int phoneNumber);

    UserDto login(int phoneNumber,
                  String email,
                  String password);

    boolean verify(long userId, long code);

    Long createActivationCode(Long userId); //??

   // void create(RegistrationDto user);

    List<UserDto> getAll();

    void update(Long id, CreateUserDto request);

    void deleteById(Long id);
}
