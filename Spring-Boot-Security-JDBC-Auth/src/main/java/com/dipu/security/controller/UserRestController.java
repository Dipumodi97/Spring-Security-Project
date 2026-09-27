package com.dipu.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/")
    public String welcome(){
        return "<h2> welcome to Security :) </h2>";
    }

    @GetMapping("/admin")
    public String adminProcess(){
        return "<h2> welcome to Admin :) </h2>";
    }

    @GetMapping("/user")
    public String userProcess(){
        return "<h2> welcome to User :) </h2>";
    }
}
