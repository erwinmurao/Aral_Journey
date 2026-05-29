package com.crud.springboot_backend.service.impl;

import org.springframework.stereotype.Service;

import com.crud.springboot_backend.dto.UserDto;
import com.crud.springboot_backend.mapper.UserMapper;
import com.crud.springboot_backend.model.User;
import com.crud.springboot_backend.repository.UserRepository;
import com.crud.springboot_backend.service.UserService;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        // TODO Auto-generated method stub

        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);

        return UserMapper.mapToUserDto(savedUser);
    }

}
