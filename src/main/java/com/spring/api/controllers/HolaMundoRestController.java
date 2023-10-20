package com.spring.api.controllers;

import com.spring.api.domain.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoRestController {
    @GetMapping("/saludo/{user}")
    public String HolaMundo(@PathVariable String user){ //con el decorator @PathVariable se toma {user} por params
        return "Hola Mundo Spring!!" + user;

    }
}
