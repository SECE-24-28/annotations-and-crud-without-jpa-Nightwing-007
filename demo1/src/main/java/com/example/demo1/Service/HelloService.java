package com.example.demo1.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(){
        return "Hello world";
    }
    public String aboutMe(){
        return "This is the about message";
    }
    public String greeting(){
        return "Greetings from Spring Boot!";
    }
}