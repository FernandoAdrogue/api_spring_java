package com.spring.api.controllers;

import com.spring.api.domain.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonaRestController {

    //Mock de almacen de personas

    ArrayList<Persona> personas = new ArrayList<>(
            List.of (new Persona(1L,"Fernando"),
                     new Persona(2L,"Lily"),
                     new Persona(3L,"Cande"),
                     new Persona(4L,"Azu"))
    );

    @GetMapping("/personas/{id}")
    public Persona getPersonaById(@PathVariable Long id){
        for (Persona persona : this.personas){
            if (persona.getId().equals(id)) {
                return persona;
            }
        }
        return null;
    }

    @GetMapping("/personas")
    public List<Persona> listPersonas(){

        return this.personas;
    }

    public Persona createPersona(Persona persona){

        return null;
    }

    public Persona updatePersona(Persona persona){

        return null;
    }

    public void deletePersona(Long id) {

    }
}
