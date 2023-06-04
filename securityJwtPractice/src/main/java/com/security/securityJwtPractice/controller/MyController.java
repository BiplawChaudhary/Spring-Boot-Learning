package com.security.securityJwtPractice.controller;


import com.security.securityJwtPractice.dto.request.AuthRequest;
import com.security.securityJwtPractice.dto.request.RegisterRequest;
import com.security.securityJwtPractice.dto.response.AuthResponse;
import com.security.securityJwtPractice.entity.User;
import com.security.securityJwtPractice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.naming.AuthenticationException;

@Controller
@RequiredArgsConstructor
public class MyController {
    private final AuthService authService;

    @GetMapping("/")
    public String getHomePage(){
        return "index";
    }

    @GetMapping("/login-form")
    public String getLoginForm(Model model){
        model.addAttribute("dto", new AuthRequest());
        return "login";
    }

    @PostMapping("/login-data")
    public String getUserProfile(@ModelAttribute AuthRequest request, Model model){


        try{
            AuthResponse token = authService.authenticate(request);
            model.addAttribute("token", token);
            //Return the page.
            return "user";
        }catch (Exception e){
            return "error/403";
        }
    }

    @GetMapping("/signup")
    public String getSignUpForm(Model model){
        model.addAttribute("dto", new RegisterRequest());
        return "signup";
    }

    @PostMapping("/signup-data")
    public String getSignUpForm(@ModelAttribute RegisterRequest request, Model model){
        var token = authService.register(request);

        if(token != null){
            model.addAttribute("token", token);
            return "user";
        }else{
            return "error/403";
        }
    }

    @GetMapping("/user")
    public String getUserPage(Model model){

        return "user";
    }
}
