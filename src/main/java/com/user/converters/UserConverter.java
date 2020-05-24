package com.user.converters;

import com.user.mappers.UserMapper;
import com.user.model.User;
import com.user.model.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserConverter {
    public User userDtoToUser(UserDto userDto) {
        return UserMapper.INSTANCE.userDtoToUser(userDto);
    }
}
