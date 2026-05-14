package com.starting.workfinance.repository;


import com.starting.workfinance.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
    boolean existsByEmail(String email);
}
