package com.security.securityJwtPractice.service.impl;

import com.security.securityJwtPractice.dto.request.AuthRequest;
import com.security.securityJwtPractice.dto.request.RegisterRequest;
import com.security.securityJwtPractice.dto.response.AuthResponse;
import com.security.securityJwtPractice.entity.Role;
import com.security.securityJwtPractice.entity.User;
import com.security.securityJwtPractice.repo.UserRepo;
import com.security.securityJwtPractice.service.AuthService;
import com.security.securityJwtPractice.service.JwtService;
import io.jsonwebtoken.Jwt;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    @Override
    public AuthResponse register(RegisterRequest request) {
        User newUser = new User();

        newUser.setFirstname(request.getFirstname());
        newUser.setLastname(request.getLastname());
        newUser.setEmail(request.getEmail());
        newUser.setPassword(passwordEncoder.encode(request.getPassword()));
        newUser.setRole(Role.USER);

        userRepo.save(newUser);

        var JwtToken = jwtService.generateToken(newUser);

        return new AuthResponse(JwtToken);
    }

    @Override
    public AuthResponse authenticate(AuthRequest request) throws Exception {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(), request.getPassword()
                )
        );


        var user = userRepo.findByEmail(request.getEmail())
                .orElseThrow(() -> new Exception("Username Not Found"));

        var JwtToken = jwtService.generateToken(user);

        return new AuthResponse(JwtToken);


    }
}
