package com.prueba.msprueba2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pruebas2")
public class PruebaController {

    @GetMapping
    ResponseEntity<String> probandoMicroservicio(){
        return new ResponseEntity<>("Hola Mundo", HttpStatus.OK);
    }
}
