package com.example.demo.dto;

public class EchoResponse {
    private final String echo;

    public EchoResponse(String echo) {
        this.echo = echo;
    }

    public String getEcho() {
        return echo;
    }
}
