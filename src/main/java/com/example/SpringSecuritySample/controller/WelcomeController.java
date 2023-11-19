package com.example.SpringSecuritySample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome To ICP Techno Sample Spring Security Project";
    }
}
