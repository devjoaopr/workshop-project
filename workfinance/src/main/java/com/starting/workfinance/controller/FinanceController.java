package com.starting.workfinance.controller;

import com.starting.workfinance.dto.CreateFinanceRequest;
import com.starting.workfinance.dto.FinanceResponse;
import com.starting.workfinance.entity.Finance;
import com.starting.workfinance.services.FinanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/finance")
@CrossOrigin(origins = "http://localhost:4200")
public class FinanceController {

    private final FinanceService financeService;

    public FinanceController(FinanceService financeService) {
        this.financeService = financeService;
    }

    @GetMapping("/get")
    public List<Finance> get() {
        return financeService.get();
    }

    @PostMapping("/create_finance")
    public ResponseEntity<FinanceResponse> create(@RequestBody CreateFinanceRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(financeService.create(request));
    }

}
