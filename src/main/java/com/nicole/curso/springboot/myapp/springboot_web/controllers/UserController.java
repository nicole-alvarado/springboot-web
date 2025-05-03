package com.nicole.curso.springboot.myapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nicole.curso.springboot.myapp.springboot_web.models.User;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Nicole", "Gianella", "Alvarado");
        user.setEmail("nicole@correo.com");
        model.addAttribute("title", "Hola Mundo desde Spring Boot");
        model.addAttribute("user", user);
        return "details"; // Nombre de la vista que esta template
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
