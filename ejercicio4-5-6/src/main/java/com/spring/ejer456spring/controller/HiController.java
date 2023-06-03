package com.spring.ejer456spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @GetMapping("/api/saludo")
    public String saludo(){
        return "Hola, este es un saludo desde la clase HelloController";
    }
}
