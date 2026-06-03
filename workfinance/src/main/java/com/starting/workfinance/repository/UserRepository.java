package com.starting.workfinance.repository;

import com.starting.workfinance.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsernameOrEmail(String username, String email);

    boolean existsByEmail(String email);
}

