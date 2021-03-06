package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.model.User;

@Controller
public class HomeController {
    @GetMapping("/form")
    private String readForm(@ModelAttribute User user) {
        return "form";
    }

    @PostMapping("/form")
    private String confirm(@ModelAttribute User user){
//        model.addAttribute("message", message);
        return "confirm";
    }
}
