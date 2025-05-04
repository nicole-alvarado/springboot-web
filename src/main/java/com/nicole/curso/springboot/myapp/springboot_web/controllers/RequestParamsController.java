package com.nicole.curso.springboot.myapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nicole.curso.springboot.myapp.springboot_web.models.dto.ParamDTO;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/params")
public class RequestParamsController {

    @GetMapping("/foo") // Ejemplo: http://localhost:8090/api/params/foo?message=Hola que tal
    public ParamDTO getFoo(@RequestParam(required = false, name = "mensaje") String message) {
        // name es nombre del parámetro (igual toma message), defaultValue es para un valor por defecto en vez de hacer el operador ternario de abajo
        
        ParamDTO param = new ParamDTO();
        param.setMessage(message!=null ? message : "Holi"); // Si es null mostrar Holi
        return param;
    }
 
    @GetMapping("/bar") // Ejemplo: http://localhost:8090/api/params/bar?text=Hola&code=1234
    public ParamDTO getBar(@RequestParam String text, @RequestParam Integer code){
        
        ParamDTO params = new ParamDTO();
        params.setMessage(text);
        params.setCode(code);

        return params;

    }
}
