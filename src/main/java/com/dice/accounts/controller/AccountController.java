package com.dice.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("")
    public String sayHe(){
        return "Hello World";
    }

    @GetMapping("sayHello")
    public String sayHello(){
        return "Hello World";
    }
}

