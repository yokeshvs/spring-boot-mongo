package com.user.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.user.converters.UserConverter;
import com.user.model.UserDto;
import com.user.model.UserSaveResponse;
import com.user.projection.Views;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "/users", consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserConverter userConverter;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @JsonView(Views.Public.class)
    public ResponseEntity<UserSaveResponse> createUser(@RequestBody UserDto userDto) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(userConverter.userDtoToUser(userDto)));
    }
}
