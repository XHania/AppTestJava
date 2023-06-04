package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String showForm(Model model) {
        model.addAttribute("message", "");
        return "hello";
    }

    @PostMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello, you!");
        return "hello";
    }
}
