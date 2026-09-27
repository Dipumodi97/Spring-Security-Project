package com.dipu.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to SBI Bank...!";
    }

    @GetMapping("/transfer")
    public String transfer(){
        return "Fund Transfer initiated ...!";
    }

    @GetMapping("/balance")
    public String checkBalance(){
        return "Your Account  Balance :: 10000 INR ...!";
    }
    @GetMapping("/about")
    public String aboutUs(){
        return "SBI BANK managing by Indian central Govt.";
    }
}
