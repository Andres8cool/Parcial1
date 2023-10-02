package com.example.API.REST.controllers;

import com.example.API.REST.entities.Persona;
import com.example.API.REST.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping(path = {"api/v1/personas"}
)
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {
    public PersonaController() {
    }
}
