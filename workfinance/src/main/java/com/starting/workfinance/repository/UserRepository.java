package com.starting.workfinance.repository;


import com.starting.workfinance.entity.Role;
import com.starting.workfinance.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsernameOrEmail(String username, String email);
}

