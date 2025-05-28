package com.nicole.curso.springboot.myapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicole.curso.springboot.myapp.springboot_web.models.User;
import com.nicole.curso.springboot.myapp.springboot_web.models.dto.ParamDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



// Si trabajamos con API Rest la idea es mandar parámetros en la ruta
@RestController
@RequestMapping("/api/var") // Ruta base
public class PathVariableController {

    @Value("${config.username}")
    private String username;
    
    @Value("${config.code}")
    private Integer code;
    
    @Value("${config.listOfValues}")
    private List<String> listOfValues;
    
    // @Value("${config.message}")
    // private String message;

    @Value("#{'${config.listOfValues}'.toUpperCase().split(',')}")
    private List<String> newListOfValues;

    @Value("#{'${config.listOfValues}'.toUpperCase()}")
    private String stringValues;

    @Value("#{${config.valuesMap}}")
    private Map<String, Object> valuesMap;

    @Value("#{${config.valuesMap}.product}")
    private String product;

    @Value("#{${config.valuesMap}.price}")
    private Integer price;

    @Autowired
    private Environment environment;

    @GetMapping("/baz/{message}") // Ruta variable, el nombre message en la ruta y parámetros si o si es obligatorio que sean iguales
    public ParamDTO getBaz(@PathVariable String message){
        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String product, @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }
    
    @PostMapping("/create")
    public User create(@RequestBody User user) {
        //TODO: Hacer algo con el usuario, por ejemplo guardarlo en la BD
        user.setName(user.getName().toUpperCase());
        
        return user;
    }

    // Los value se pueden agregar como argumentos
    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}") String message){
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("code", code);
        json.put("message", message);
        json.put("message2", environment.getProperty("config.message")); // Usando environment
        json.put("code2", Integer.valueOf(environment.getProperty("config.code"))); // Usando environment
        json.put("listOfValues", listOfValues);
        json.put("newListOfValues", newListOfValues);
        json.put("stringValues", stringValues);
        json.put("valuesMap", valuesMap);
        json.put("product", product);
        json.put("price", price);
        return json;
    }
    
}
