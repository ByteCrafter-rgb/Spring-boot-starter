package com.example.demo.dto;

public class EchoRequest {
    private final String echo;

    public EchoRequest(String echo) {
        this.echo = echo;
    }

    public String getEcho() {
        return echo;
    }
}
