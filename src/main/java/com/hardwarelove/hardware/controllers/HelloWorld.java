package com.hardwarelove.hardware.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/id")
    public String sayHello2() {
        return "Hello World id";
    }

}
