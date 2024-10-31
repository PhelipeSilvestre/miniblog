package com.descomplica.FrameBlog.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.descomplica.FrameBlog.repositories.*;
import com.descomplica.FrameBlog.models.User;
import com.descomplica.FrameBlog.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(final User user) {
        User existingUser = userRepository.findByUsername(user.getName());
        if (Objects.nonNull(existingUser)) {
            throw new RuntimeException("User already exists");
        }
        User entity = new User(user.getUserId(), user.getName(), user.getEmail(), user.getPassword(), user.getRole());
        User newUser = userRepository.save(entity);
        return new User(newUser.getUserId(), newUser.getName(), newUser.getEmail(), newUser.getPassword(),
                newUser.getRole());
    }

}
