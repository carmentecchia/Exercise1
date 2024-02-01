package com.example.Exercise1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//Scrivi una applicazione web Spring Boot che alla endpoint
// GET v1/ciao?nome=Giuseppe&provincia=Lombardia risponde con "Ciao Giuseppe, com'è il tempo in Lombardia?"
@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping(path = "/Ciao")
    public String getNome (@RequestParam String nome, @RequestParam String provincia){
        return "Ciao " + nome + " com'è il tempo in " + provincia;
    }

    @GetMapping("/Hello")
    public String hello (){
        return "Hello world";
    }
}
