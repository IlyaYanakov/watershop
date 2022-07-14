package com.waterProject.waterShop.service.impl;

import com.waterProject.waterShop.dto.request.CreateUserDto;
import com.waterProject.waterShop.dto.response.RegistrationDto;
import com.waterProject.waterShop.dto.response.SessionDto;
import com.waterProject.waterShop.dto.response.UserDto;
import com.waterProject.waterShop.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public SessionDto registration(String login, String password) {
        return null;
    }

    @Override
    public UserDto registration(String fullName, String password, String email, int phoneNumber) {
        return null;
    }

    @Override
    public UserDto login(int phoneNumber, String email, String password) {
        return null;
    }

    @Override
    public boolean verify(long userId, long code) {
        return false;
    }

    @Override
    public Long createActivationCode(Long userId) {
        return null;
    }

    @Override
    public void create(RegistrationDto user) {

    }

    @Override
    public List<UserDto> getAll() {
        return null;
    }

    @Override
    public void update(Long id, CreateUserDto request) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
