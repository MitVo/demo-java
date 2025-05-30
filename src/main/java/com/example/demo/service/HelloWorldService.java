package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String getHelloMessage() {
        int a = 10;
        return "Hello World from : " + this.getClass().getName() + " " + a;
    }
}
