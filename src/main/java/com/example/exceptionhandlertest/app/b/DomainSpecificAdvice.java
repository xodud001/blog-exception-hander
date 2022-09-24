package com.example.exceptionhandlertest.app.b;

import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Order(100)
@RestControllerAdvice
public @interface DomainSpecificAdvice {
}
