package com.example.API.REST.controllers;

import com.example.API.REST.entities.Domicilio;
import com.example.API.REST.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(
        origins = {"*"}
)
@RequestMapping(path = {"api/v1/domicilios"})
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
    public DomicilioController() {
    }
}