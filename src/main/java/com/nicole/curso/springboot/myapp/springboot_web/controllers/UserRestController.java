package com.nicole.curso.springboot.myapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicole.curso.springboot.myapp.springboot_web.models.User;
import com.nicole.curso.springboot.myapp.springboot_web.models.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestParam;


// Esto es API Rest
@RestController // Convierte el método handler en un método handler Rest
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public UserDTO details(){
        UserDTO userDTO = new UserDTO();

        User user = new User("Nicole", "Gianella", "Alvarado");
        
        // userDTO.setName(user.getName().concat(" ").concat(user.getSecondName())); // Mostrar los dos nombres
        // userDTO.setLastname(user.getLastname());
        userDTO.setUser(user);
        userDTO.setTitle("Hola Mundo desde Spring Boot");
        
        return userDTO; // estamos pasando datos para compartir con el frontend
    }

    
    @GetMapping("/list-users")
    public List<User> getUsers(){
        User user1 = new User("Nicole", "Gianella", "Alvarado");
        User user2 = new User("Denis", "Rodriguez");
        User user3 = new User("Elise",  "Alvarado");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        return users;
    }

    @GetMapping("/details-map")
    public Map<String,Object> detailsMap(){
        User user = new User("Nicole", "Gianella", "Alvarado");
        Map<String,Object> body = new HashMap<>();

        body.put("title", "Hola Mundo desde Spring Boot");
        body.put("user", user);
        return body; // Si devuelvo User, devolverá solo el objeto User
    }

}

// Nota: También podría en lugar de @RestController usar @Controller, y debajo del @GetMapping usar @ResponseBody, ya que esta forma separada es equivalente a @RestController
// GetMapping es un alias, un atajo, es equivalente a: @RequestMapping(path = "/details", method = RequestMethod.GET)