package com.example.exceptionhandlertest.app.b;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/throw")
    public String test(){
        throw new TestException(this.getClass().getSimpleName() + "에서 예외 발생!");
    }
}
