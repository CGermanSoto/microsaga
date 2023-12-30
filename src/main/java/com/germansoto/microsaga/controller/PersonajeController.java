package com.germansoto.microsaga.controller;

import com.germansoto.microsaga.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonajeController {

    @Autowired
    private IPersonajeService personajeService;

    public String probandoDependencias(){
        return "personajeService.funciona()";
    }
}
