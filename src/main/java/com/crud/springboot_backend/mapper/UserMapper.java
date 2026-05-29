package com.crud.springboot_backend.mapper;

import com.crud.springboot_backend.dto.UserDto;
import com.crud.springboot_backend.model.User;

public class UserMapper {

public static UserDto mapToUserDto(User user) {
    return new UserDto(
        user.getId(),
        user.getFirstName(),
        user.getLastName(),
        user.getEmail(),
        user.getPassword()
    );
}

 public static User mapToUser(UserDto userDto){
    return new User(
        userDto.getId(),
        userDto.getFirstName(),
        userDto.getLastName(),
        userDto.getEmail(),
        userDto.getPassword()
    );
 }

}
