package com.starting.workfinance.services;

import com.starting.workfinance.dto.CreateFinanceRequest;
import com.starting.workfinance.dto.FinanceResponse;
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


    public FinanceResponse create(CreateFinanceRequest request) {

        Finance finance = new Finance();

        finance.setName(request.getName());
        finance.setDescription(request.getDescription());
        finance.setValue(request.getValue());

        Finance saved = financeRepository.save(finance);

        return new FinanceResponse(
                saved.getName(),
                saved.getDescription(),
                saved.getValue()
        );
    }

}
