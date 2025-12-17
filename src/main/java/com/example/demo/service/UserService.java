package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(UserRequest userRequest) {
        User user = new User();

        user.setName(userRequest.name());
        user.setEmail(userRequest.email());

        User savedUser = userRepository.save(user);

        UserResponse userResponse = new UserResponse(savedUser.getId(), savedUser.getName(),
                savedUser.getEmail(), savedUser.getCreatedAt());

        return userResponse;
    }
}
