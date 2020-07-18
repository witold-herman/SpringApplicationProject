package com.example.SpringThymyleafApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/")
    public String getInfo(
            @RequestParam(value = "name", defaultValue = "No parameter found") String name,
            @RequestParam(value = "password", defaultValue = "No parameter found") String password,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("password", password);
        return "logincontroller";
    }
}
