package com.security.securityJwtPractice.service;

import com.security.securityJwtPractice.dto.request.AuthRequest;
import com.security.securityJwtPractice.dto.request.RegisterRequest;
import com.security.securityJwtPractice.dto.response.AuthResponse;

public interface AuthService {

    AuthResponse register(RegisterRequest request);
    AuthResponse authenticate(AuthRequest request) throws Exception;
}
