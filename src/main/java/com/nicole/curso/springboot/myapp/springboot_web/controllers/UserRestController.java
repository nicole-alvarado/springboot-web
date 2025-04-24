package com.nicole.curso.springboot.myapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Convierte el método handler en un método handler Rest
public class UserRestController {
    
    @GetMapping("/details2")
    public Map<String,Object> details(){
        Map<String,Object> body = new HashMap<>();

        body.put("title", "Hola Mundo desde Spring Boot");
        body.put("name", "Nicole");
        body.put("lastname", "Alvarado");
        return body;
    }

}
