package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.EchoRequest;
import com.example.demo.dto.EchoResponse;

@Service
public class EchoService {
    public EchoResponse processEcho(EchoRequest request) {
        String message = request.getEcho();

        // **Validation/Business Logic moved from Controller**
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("The echo message cannot be empty or contain only whitespace.");
        }

        // **Echo Logic**
        return new EchoResponse(message);
    }
}
