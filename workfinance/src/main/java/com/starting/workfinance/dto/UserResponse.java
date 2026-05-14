package com.starting.workfinance.dto;
import java.time.Instant;
import java.util.UUID;

public class UserResponse {
    private Instant created_at;
    private String password;
    private String email;
    private String name;

    public UserResponse(Instant created_at, String password, UUID id, String email, String name) {
        this.created_at = created_at;
        this.password = password;
        this.email = email;
        this.name = name;
    }
}
