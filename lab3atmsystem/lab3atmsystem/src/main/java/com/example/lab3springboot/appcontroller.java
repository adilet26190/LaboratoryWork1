package com.example.lab3springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appcontroller {

    @GetMapping
    public String viewhome(){
        return "index";
    }
}
