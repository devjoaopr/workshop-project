package com.starting.workfinance.services;
import com.starting.workfinance.entity.Finance;
import com.starting.workfinance.repository.FinanceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceService {

    private final FinanceRepository financeRepository;

    public FinanceService(FinanceRepository financeRepository) {
        this.financeRepository = financeRepository;
    }
    public List<Finance> get() {
        return (List<Finance>) financeRepository.findAll();
    }
}
