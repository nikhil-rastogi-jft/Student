package com.example.student.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value=NullPointerException.class)
    public ResponseEntity<?> resourceNotFoundExceptionHandler(){
        System.out.println("null pointer exception");
        return ResponseEntity.status(404).body("Record not found");
    }
    @ExceptionHandler(value=Exception.class)
    public ResponseEntity<?> exceptionHandler(){
        System.out.println("Invalid input");
        return ResponseEntity.status(500).body("Invalid Id ");
    }
}
