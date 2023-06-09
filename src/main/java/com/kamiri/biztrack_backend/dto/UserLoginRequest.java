package com.kamiri.biztrack_backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserLoginRequest {

    @JsonProperty("username_or_email")
    private String usernameOrEmail;
    
    private String password;

    public UserLoginRequest() {
    }

    public UserLoginRequest(String usernameOrEmail, String password) {
        this.usernameOrEmail = usernameOrEmail;
        this.password = password;
    }

    public String getUsernameOrEmail() {
        return this.usernameOrEmail;
    }

    public String getPassword() {
        return this.password;
    }
}
