package com.starting.workfinance.repository;


import com.starting.workfinance.entity.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepository extends CrudRepository<Users, UUID> {
    boolean existsByEmail(String email);
}
