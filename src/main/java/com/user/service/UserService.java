package com.user.service;

import com.user.model.User;
import com.user.model.UserSaveResponse;

public interface UserService {
    UserSaveResponse create(User user) throws Exception;
}
