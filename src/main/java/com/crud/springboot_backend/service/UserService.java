package com.crud.springboot_backend.service;

import java.util.List;

import com.crud.springboot_backend.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();
}
