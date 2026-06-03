package com.starting.workfinance.controller;

import com.starting.workfinance.dto.CreateUserRequest;
import com.starting.workfinance.dto.UserResponse;
import com.starting.workfinance.entity.Users;
import com.starting.workfinance.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @RequestMapping("/new")
    public UserResponse create(
            @RequestBody CreateUserRequest createUserRequest
    ) {
        try {
            return userService.createUser(createUserRequest);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @GetMapping("/get")
    public List<Users> get() {
        return userService.get();
    }
}
