package com.crud.springboot_backend.service;

import com.crud.springboot_backend.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);

}
