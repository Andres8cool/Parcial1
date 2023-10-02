package com.example.API.REST.controllers;

import com.example.API.REST.entities.Autor;
import com.example.API.REST.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping(path = {"api/v1/autores"})
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
    public AutorController() {
    }
}