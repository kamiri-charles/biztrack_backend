package com.kamiri.biztrack_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kamiri.biztrack_backend.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.kamiri.biztrack_backend.dto.UserLoginRequest;
import com.kamiri.biztrack_backend.models.User;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
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

        @GetMapping("/is-user-signed-in/{id}")
        public Boolean isUserSignedIn(@PathVariable("id") UUID userUUID) {
            if (userRepository.findByUuid(userUUID) != null) {
                return true;
            } else {
                return false;
            }
        }
}
