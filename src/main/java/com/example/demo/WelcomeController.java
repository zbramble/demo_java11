package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String Welcome() {
        String welcomeMsg = "Welcome to Java 11 Project!";

        //TODO Test Remove Git SSH Key
        return welcomeMsg;
    }
}