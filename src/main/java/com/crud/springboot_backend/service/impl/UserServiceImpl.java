package com.crud.springboot_backend.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
            .orElseThrow(() -> 
                new RuntimeException("User not found with id: " + userId));

        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
            .map((user) -> UserMapper.mapToUserDto(user))
            .collect(Collectors.toList());
    }

}
