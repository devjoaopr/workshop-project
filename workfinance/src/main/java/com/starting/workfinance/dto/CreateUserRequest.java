package com.starting.workfinance.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CreateUserRequest {
    private String password;
    private String username;
    private String email;
    private String role;
}
