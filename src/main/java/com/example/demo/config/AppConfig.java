package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner customStartupRunner() {

        return args -> {
            System.out.println("------------------------------------------------------------------");
            System.out.println("🚀 CommandLineRunner Executed: All Beans and the Web Server are ready!");
            System.out.println("------------------------------------------------------------------");
        };
    }
}
