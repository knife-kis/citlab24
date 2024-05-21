package ru.citlab.citlab24.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }
    @GetMapping("/service-details")
    public String service(Model model) {
        return "service-details";
    }
}
