package com.user.mappers;

import com.user.model.User;
import com.user.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class UserMapper {
    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    protected void useCustomLogicForAField(UserDto userDto, @MappingTarget User user) {
        //This method can be used if some fields require custom logic to be mapped
        //The rest of the conversion will be handled by the mapper as is
    }

    public abstract User userDtoToUser(UserDto userDto);
}
