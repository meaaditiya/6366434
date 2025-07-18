package com.assignment.account_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account/hello")
    public String sayHello() {
        return "Hello from Account Service!";
    }
}
