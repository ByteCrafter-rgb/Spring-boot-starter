package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 1. @RestController marks this class as capable of handling incoming web requests
@RestController
public class HelloController {

    // 2. @GetMapping("/") maps HTTP GET requests for the root path (/) to this
    // method
    @GetMapping("/")
    public String sayHello() {
        return "Hello World! This is my first Spring Boot API.";
    }

    @PostMapping("/echo")
    public EchoResponse checkHealth(@RequestBody EchoRequest inputStatus) {
        if (inputStatus.getEcho().isEmpty()) {
            throw new IllegalArgumentException("The echo message cannot be empty.");
        }
        return new EchoResponse(inputStatus.getEcho());
    }
}