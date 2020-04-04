package com.bootsecurity.prac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String getGreeting() {
        return "HELLO !!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "HELLO ADMIN";
    }

    @GetMapping("/user")
    public String user() {
        return "HELLO USER";
    }
}
