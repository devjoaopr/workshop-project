package com.starting.workfinance.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
public class UserResponse {
    private String email;
    private String name;
}