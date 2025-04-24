package com.nicole.curso.springboot.myapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Esto es API Rest
@RestController // Convierte el método handler en un método handler Rest
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public Map<String,Object> details(){
        Map<String,Object> body = new HashMap<>();

        body.put("title", "Hola Mundo desde Spring Boot");
        body.put("name", "Nicole");
        body.put("lastname", "Alvarado");
        return body;
    }

}

// Nota: También podría en lugar de @RestController usar @Controller, y debajo del @GetMapping usar @ResponseBody, ya que esta forma separada es equivalente a @RestController
// GetMapping es un alias, un atajo, es equivalente a: @RequestMapping(path = "/details", method = RequestMethod.GET)