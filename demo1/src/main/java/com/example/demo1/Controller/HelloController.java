package com.example.demo1.Controller;

import com.example.demo1.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/Home")
    public String home(){
        return helloService.sayHello();
    }
    @GetMapping("/About")
    public String about(){
        return helloService.aboutMe();
    }
    @GetMapping("/Greeting")
    public String greeting(){
        return helloService.greeting();
    }
}