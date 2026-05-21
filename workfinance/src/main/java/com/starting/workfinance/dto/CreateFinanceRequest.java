package com.starting.workfinance.dto;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class CreateFinanceRequest {
    private String description;
    private String value;
    private String name;
}
