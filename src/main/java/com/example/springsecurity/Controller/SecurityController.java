package com.example.springsecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SecurityController {
    @GetMapping("/")
    public String home(HttpServletRequest request) {
        return "Welcome to Spring Security"+request.getSession().getId();
    }
}
