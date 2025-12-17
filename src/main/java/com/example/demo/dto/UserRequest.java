package com.example.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRequest(

        @NotBlank(message = "Name is required.") String name,

        @Email @NotBlank(message = "Email is required.") String email) {
};
