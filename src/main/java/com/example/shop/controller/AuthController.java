package com.example.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/signup")
    public String signup() {
        return "auth/signup";
    }
}
