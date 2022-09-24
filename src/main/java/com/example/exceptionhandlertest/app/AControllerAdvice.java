package com.example.exceptionhandlertest.app;

import com.example.exceptionhandlertest.app.b.TestException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ExceptionResponse runtimeException(RuntimeException e){
        return new ExceptionResponse(this.getClass().getSimpleName() + "의 runtimeException() 에서 처리!", e.getMessage());
    }

    @ExceptionHandler(TestException.class)
    public ExceptionResponse testException(TestException e){
        return new ExceptionResponse(this.getClass().getSimpleName() + "의 testException() 에서 처리!", e.getMessage());
    }
}
