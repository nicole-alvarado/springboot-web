package com.nicole.curso.springboot.myapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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
    
    @GetMapping("/list-users")
    public String getUsers(ModelMap model) {
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users") // Es global al controlador, va a estar disponible para todas las vistas
    public List<User> usersModel(){
        return Arrays.asList(
            new User("Nicole", "Gianella", "Alvarado", "nicole@correo.com"), 
            new User("Zulma", "Rodriguez"),
            new User("Denis","Christian", "Rodriguez", "denis@correo.com"), 
            new User("Beto", "Alvarado"));
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
