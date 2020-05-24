package com.user.service;

import com.user.model.User;
import com.user.model.UserSaveResponse;
import com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserSaveResponse create(User user) {
        User savedUser = userRepository.save(user);
        return new UserSaveResponse(savedUser.getId(), savedUser.getEmail());
    }
}
