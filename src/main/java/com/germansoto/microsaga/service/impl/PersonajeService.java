package com.germansoto.microsaga.service.impl;

import com.germansoto.microsaga.service.IPersonajeService;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService implements IPersonajeService {
    @Override
    public String funciona() {
        return "Funciona Correctamente";
    }
}
