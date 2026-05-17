package com.starting.workfinance.controller;

import com.starting.workfinance.entity.Finance;
import com.starting.workfinance.services.FinanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/finance")
public class FinanceController {

    private final FinanceService financeService;

    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping("/get")
    public List<Finance> get() {
        return financeService.get();
    }
}
