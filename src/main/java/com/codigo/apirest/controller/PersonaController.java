package com.codigo.apirest.controller;

import com.codigo.apirest.entity.PersonaEntity;
import com.codigo.apirest.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/grabar")
    public PersonaEntity crearPersona(@RequestBody PersonaEntity persona){
        return personaService.actualizarPersona(persona);
    }
}
