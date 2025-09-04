package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeometricController {

    @GetMapping("/area-circle")
    public double getAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }
}
