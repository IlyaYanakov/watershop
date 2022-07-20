package com.waterProject.waterShop.service;

import com.waterProject.waterShop.dto.response.UserDto;

import java.util.List;

public interface UserService {
//    String auth(RegistrationDto request);
//
//    Long getIdByToken(String token);
//
//    void registration(RegistrationDto request);

    List<UserDto> getAll();

    void deleteById(Long id);
}


