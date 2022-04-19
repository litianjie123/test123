package com.example.demotestweb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test/users")
public class TestController {
    @PostMapping
    public String test() {
        System.out.println("test 1111");
        return "test 1111";
    }

    @GetMapping
    public String test2222() {
        System.out.println("test 2222");
        return "test 2222";
    }

    @PutMapping
    public String test3333() {
        System.out.println("test 3333");
        return "test 3333";
    }
}
