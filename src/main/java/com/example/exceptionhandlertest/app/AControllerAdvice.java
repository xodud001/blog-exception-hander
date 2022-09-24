package com.example.exceptionhandlertest.app;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ExceptionResponse runtimeException(RuntimeException e){
        return new ExceptionResponse(this.getClass().getSimpleName() + "에서 처리!", e.getMessage());
    }
}
