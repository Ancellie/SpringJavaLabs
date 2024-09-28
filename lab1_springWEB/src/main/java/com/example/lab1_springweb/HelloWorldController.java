package com.example.lab1_springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    @ResponseBody
    String helloWorld() {
        return "<h1>" +
                "<a href=\"http://localhost:8080/Oleg\">Hello from Oleg</a> <br>" +
                "<a href=\"http://localhost:8080/Olexandr\">Hello from Olexandr</a> <br>" +
                "<a href=\"http://localhost:8080/Marat\">Hello from Marat</a> <br>" +
                "<a href=\"http://localhost:8080/Sviatoslav\">Hello from Sviatoslav</a> <br>" +
                "<a href=\"http://localhost:8080/Nazarii\">Hello from Nazarii</a> <br>" +
                "</h1>";
    }

    @GetMapping("/Oleg")
    @ResponseBody
    String helloWorldOleg() {
        return "<h1>My name is Oleg, Hi all!</h1>";
    }

    @GetMapping("/Olexandr")
    @ResponseBody
    String helloWorldOlexandr() {
        return "<h1>My name is Olexandr, Hi all!</h1>";
    }

    @GetMapping("/Marat")
    @ResponseBody
    String helloWorldMarat() {
        return "<h1>My name is Marat, Hi all!</h1>";
    }

    @GetMapping("/Sviatoslav")
    @ResponseBody
    String helloWorldSviatoslav() {
        return "<h1>My name is Sviatoslav, Hi all!</h1>";
    }

    @GetMapping("/Nazarii")
    @ResponseBody
    String helloWorldNazarii() {
        return "<h1>My name is Nazarii, Hi all!</h1>";
    }
}
