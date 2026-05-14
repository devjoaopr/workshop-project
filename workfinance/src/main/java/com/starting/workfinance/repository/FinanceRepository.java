package com.starting.workfinance.repository;

import com.starting.workfinance.dto.FinanceResponse;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface FinanceRepository extends CrudRepository<FinanceResponse, UUID> {
    boolean existsById(UUID id);
}
