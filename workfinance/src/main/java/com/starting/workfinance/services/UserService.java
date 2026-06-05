package com.starting.workfinance.services;


import com.starting.workfinance.dto.CreateUserRequest;
import com.starting.workfinance.dto.UserResponse;
import com.starting.workfinance.entity.Role;
import com.starting.workfinance.entity.Users;
import com.starting.workfinance.repository.RoleRepository;
import com.starting.workfinance.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }

    public UserResponse createUser(CreateUserRequest createUserRequest) throws Exception {
        if (userRepository.existsByEmail((createUserRequest.getEmail()))) {
            throw new Exception("This user already Exists !!");
        }
        Users user = new Users();
        Role role = roleRepository.findByName(createUserRequest.getRole());

        user.setEmail(createUserRequest.getEmail());
        user.setPassword(passwordEncoder.encode(createUserRequest.getPassword()));
        user.setUsername(createUserRequest.getUsername());
        user.setRoles(Set.of(role));

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
