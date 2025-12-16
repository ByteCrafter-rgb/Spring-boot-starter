package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EchoRequest;
import com.example.demo.dto.EchoResponse;
import com.example.demo.service.EchoService;

import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;

// 1. @RestController marks this class as capable of handling incoming web requests
@RestController
public class HelloController {

    public final EchoService echoService;

    public HelloController(EchoService echoService) {
        this.echoService = echoService;
    }

    @PostMapping("/echo")
    public EchoResponse checkHealth(@Valid @RequestBody EchoRequest inputStatus) {
        if (inputStatus.getEcho().isEmpty()) {
            throw new IllegalArgumentException("The echo message cannot be empty.");
        }
        return new EchoResponse(inputStatus.getEcho());
    }

    @PostConstruct
    public void onInit() {
        System.out.println("✅ EchoService has been fully created and is ready to process requests!");
    }
}