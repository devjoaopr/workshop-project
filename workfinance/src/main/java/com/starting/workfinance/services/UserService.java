package com.starting.workfinance.services;

import com.starting.workfinance.dto.CreateUserRequest;
import com.starting.workfinance.dto.UserResponse;
import com.starting.workfinance.entity.Users;
import com.starting.workfinance.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(CreateUserRequest createUserRequest) throws Exception {
        if (userRepository.existsByEmail((createUserRequest.getEmail()))) {
            throw new Exception("This user already Exists !!");
        }
        Users user = new Users();
        user.setEmail(createUserRequest.getEmail());
        user.setPassword(createUserRequest.getPassword());
        user.setName(createUserRequest.getUsername());
        Users saved = userRepository.save(user);

        return new UserResponse(
                saved.getEmail(),
                saved.getPassword()
        );
    }

    public List<Users> get() {
        return (List<Users>) userRepository.findAll();
    }

}
