import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

package com.example.demo.controller;


@RestController
public class GoobyeWorldController {

    @GetMapping("/goobye")
    public String goobyeWorld() {
        return "Goobye World";
    }
}