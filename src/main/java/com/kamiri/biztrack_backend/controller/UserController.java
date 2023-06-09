package com.kamiri.biztrack_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kamiri.biztrack_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.kamiri.biztrack_backend.dto.UserLoginRequest;
import com.kamiri.biztrack_backend.models.User;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/sign-in")
    public User signIn(@RequestBody UserLoginRequest userLoginRequest) {
            User userObj;

            String usernameOrEmail = userLoginRequest.getUsernameOrEmail();
            String password = userLoginRequest.getPassword();
            boolean isEmail = usernameOrEmail.contains("@");

            if (!isEmail) {
                userObj = userRepository.findByUsername(usernameOrEmail);
            }
            else {
                userObj = userRepository.findByEmail(usernameOrEmail);
            }

            if (userObj != null && userObj.getPassword().equals(password)) {
                return userObj;
            }
            else {
                return null;
            }
        }
}
