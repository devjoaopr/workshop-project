package com.starting.workfinance.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FinanceResponse {

    private String name;
    private String description;
    private String value;
}