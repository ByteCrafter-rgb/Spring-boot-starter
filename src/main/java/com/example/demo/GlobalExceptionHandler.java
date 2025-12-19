package com.example.demo;

import java.time.Instant;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.dto.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ApiResponse<Object>> handleStatusException(ResponseStatusException ex) {

        ApiResponse<Object> errorResponse = new ApiResponse<>(
                false,
                ex.getReason(),
                null);

        return new ResponseEntity<>(errorResponse, ex.getStatusCode());
    }

    // @ExceptionHandler(MethodArgumentNotValidException.class)
    // public ResponseEntity<ErrorResponse>
    // handleArgumentNotValidException(MethodArgumentNotValidException ex) {

    // Object errors = ex.getBindingResult().getFieldErrors().stream()
    // .collect(Collectors.toMap(
    // FieldError::getField,
    // FieldError::getDefaultMessage));

    // ErrorResponse finalErrorBody = new
    // ErrorResponse(HttpStatus.BAD_REQUEST.value(), errors, Instant.now());

    // return new ResponseEntity<>(finalErrorBody, HttpStatus.BAD_REQUEST);
    // }
}
