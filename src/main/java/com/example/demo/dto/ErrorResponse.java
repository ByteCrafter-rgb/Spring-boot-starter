package com.example.demo.dto;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ErrorResponse {
    final int httpstatusCode;
    final Object details;
    final Instant timestamp;

    public ErrorResponse(int httpstatusCode, Object details, Instant timestamp) {
        this.httpstatusCode = httpstatusCode;
        this.details = details;
        this.timestamp = timestamp;
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleGenericErrors(RuntimeException ex) {
        ErrorResponse error = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal Server Error",
                Instant.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
