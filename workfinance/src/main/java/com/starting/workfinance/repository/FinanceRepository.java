package com.starting.workfinance.repository;

import com.starting.workfinance.dto.FinanceResponse;
import com.starting.workfinance.entity.Finance;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface FinanceRepository extends CrudRepository<Finance, UUID> {
    boolean existsById(UUID id);
}
