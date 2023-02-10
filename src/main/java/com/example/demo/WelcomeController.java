package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String Welcome() {
        String welcomeMsg = "Welcome to Java 11 Project!";

        //TODO Test Git Push
        return welcomeMsg;
    }
}