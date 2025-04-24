package com.nicole.curso.springboot.myapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRestController {
    
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola Mundo desde Spring Boot");
        model.addAttribute("name", "Nicole");
        model.addAttribute("lastname", "Alvarado");
        return "details";
    }
    
    // Modo con Map
    /*@GetMapping("/details")
    public String details(Map<String, Object> model){
        model.put("title", "Hola Mundo desde Spring Boot");
        model.put("name", "Nicole");
        model.put("lastname", "Alvarado");
        return "details";
    }*/
}
