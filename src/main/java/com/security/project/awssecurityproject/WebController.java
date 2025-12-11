package com.security.project.awssecurityproject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping ("/")
    public String home() {
        return "home";
    }
}
