package com.example.demo.controller;

import com.example.demo.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return helloWorldService.getHelloMessage();
    }
}
