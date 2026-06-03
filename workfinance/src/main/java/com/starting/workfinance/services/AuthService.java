package com.starting.workfinance.services;

import com.starting.workfinance.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
