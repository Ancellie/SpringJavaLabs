package com.example.lab1_springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    @ResponseBody
    String helloWorld() {
        return "Hello World";
    }
}
