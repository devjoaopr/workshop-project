package com.starting.workfinance.services;

import com.starting.workfinance.dto.CreateUserRequest;
import com.starting.workfinance.dto.UserResponse;
import com.starting.workfinance.entity.User;
import com.starting.workfinance.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(CreateUserRequest createUserRequest) throws Exception {
        if (userRepository.existsByEmail(createUserRequest.getEmail())) {
            throw new Exception("This user already Exists !!");
        }
        User user = new User();
        user.setEmail(createUserRequest.getEmail());
        user.setPassword(createUserRequest.getPassword());
        user.setName(createUserRequest.getName());

        User saved = userRepository.save(user);

        return new UserResponse(
                saved.getCreatedAt(),
                saved.getEmail(),
                saved.getId(),
                saved.getPassword(),
                saved.getName()
        );
    }

    ;
}
