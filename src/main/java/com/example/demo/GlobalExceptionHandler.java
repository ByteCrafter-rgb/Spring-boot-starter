package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {

        // 1. Get the error message from the exception
        String errorMessage = ex.getMessage();

        // 2. Set the desired HTTP status code
        HttpStatus status = HttpStatus.BAD_REQUEST;

        // 3. Return a ResponseEntity with the message and the status
        return new ResponseEntity<>(errorMessage, status);
    }
}
