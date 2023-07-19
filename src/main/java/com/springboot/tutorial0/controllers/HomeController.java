package com.springboot.tutorial0.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    String home() {
        return "Hello World!";
    }

}
