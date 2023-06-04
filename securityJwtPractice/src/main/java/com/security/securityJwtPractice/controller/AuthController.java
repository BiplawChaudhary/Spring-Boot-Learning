package com.security.securityJwtPractice.controller;


import com.security.securityJwtPractice.dto.request.AuthRequest;
import com.security.securityJwtPractice.dto.request.RegisterRequest;
import com.security.securityJwtPractice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request){
        return new ResponseEntity<>(authService.register(request), HttpStatus.OK);
    }
    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody AuthRequest request) throws Exception {
        return new ResponseEntity<>(authService.authenticate(request), HttpStatus.OK);
    }
}
