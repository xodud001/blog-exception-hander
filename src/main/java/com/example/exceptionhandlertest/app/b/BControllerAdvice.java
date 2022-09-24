package com.example.exceptionhandlertest.app.b;


import com.example.exceptionhandlertest.app.ExceptionResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;


@DomainSpecificAdvice
public class BControllerAdvice {

    @ExceptionHandler(TestException.class)
    public ExceptionResponse testException(TestException e){
        return new ExceptionResponse(this.getClass().getSimpleName() + "의 testException() 에서 처리!", e.getMessage());
    }
}
