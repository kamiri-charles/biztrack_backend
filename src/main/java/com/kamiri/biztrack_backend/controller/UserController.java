package com.kamiri.biztrack_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kamiri.biztrack_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.kamiri.biztrack_backend.dto.UserLoginRequest;
import com.kamiri.biztrack_backend.models.User;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/sign-in")
    public User signIn(@RequestBody UserLoginRequest userLoginRequest) {
        return userRepository.findByUsername(userLoginRequest.getUsername());
    }
}