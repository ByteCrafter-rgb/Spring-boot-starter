package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EchoRequest {
    @NotBlank(message = "String cannot be empty or null.")
    @Size(min = 1, max = 255, message = "Invalid string size!")
    private final String echo;

    public EchoRequest(String echo) {
        this.echo = echo;
    }

    public String getEcho() {
        return echo;
    }
}
