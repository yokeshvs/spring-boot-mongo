package com.user.repository;

import com.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    User save(User user);
    User findByEmail(String email);
    Optional<User> findById(String id);
}
