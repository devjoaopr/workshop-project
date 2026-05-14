package com.starting.workfinance.dto;

import java.util.UUID;

public class FinanceResponse {

    private String value;
    private String name;
    private String description;

    public FinanceResponse(UUID id, String value, String name, String description) {
        this.value = value;
        this.name = name;
        this.description = description;
    }
}
