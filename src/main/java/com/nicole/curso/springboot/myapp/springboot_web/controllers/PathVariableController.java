package com.nicole.curso.springboot.myapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicole.curso.springboot.myapp.springboot_web.models.dto.ParamDTO;

// Si trabajamos con API Rest la idea es mandar parámetros en la ruta
@RestController
@RequestMapping("/api/var") // Ruta base
public class PathVariableController {

    @GetMapping("/baz/{message}") // Ruta variable, el nombre message en la ruta y parámetros si o si es obligatorio que sean iguales
    public ParamDTO getBaz(@PathVariable String message){
        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }
}
