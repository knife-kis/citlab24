package ru.citlab.citlab24.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(HttpServletRequest request, Model model) {
        model.addAttribute("currentPath", request.getRequestURI());
        return "index";
    }

    @GetMapping("/contact")
    public String contact(HttpServletRequest request, Model model) {
        model.addAttribute("currentPath", request.getRequestURI());
        return "contact";
    }
    @GetMapping("/service-details")
    public String service(HttpServletRequest request, Model model) {
        model.addAttribute("currentPath", request.getRequestURI());
        return "service-details";
    }
}
