package com.example.demo;

import java.time.Instant;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgument(IllegalArgumentException ex) {

        Object errorMessage = ex.getMessage();

        HttpStatus status = HttpStatus.BAD_REQUEST;

        ErrorResponse finalErrorBody = new ErrorResponse(status.value(), errorMessage, Instant.now());

        return new ResponseEntity<>(finalErrorBody, status);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleArgumentNotValidException(MethodArgumentNotValidException ex) {

        Object errors = ex.getBindingResult().getFieldErrors().stream()
                .collect(Collectors.toMap(
                        FieldError::getField,
                        FieldError::getDefaultMessage));

        ErrorResponse finalErrorBody = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), errors, Instant.now());

        return new ResponseEntity<>(finalErrorBody, HttpStatus.BAD_REQUEST);
    }
}
