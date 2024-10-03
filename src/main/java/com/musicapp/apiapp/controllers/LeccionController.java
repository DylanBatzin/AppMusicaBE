package com.musicapp.apiapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.musicapp.apiapp.services.LeccionServices;
import com.musicapp.apiapp.model.LeccionModel;
import java.util.Optional;

import java.util.ArrayList;

@RestController
@RequestMapping("/leccion")
public class LeccionController {
    @Autowired
    LeccionServices leccionServices;
    @GetMapping
    public ArrayList<LeccionModel> obtenerleccion(){
    return leccionServices.ObtenerLeccion();
    }  
     @PostMapping()
    public LeccionModel guardarleccion(@RequestBody LeccionModel leccion){
        return leccionServices.GuargarLeccion(leccion);
    }
    @GetMapping("/{id}")
    public Optional<LeccionModel> obtenerPersonaPorId(@PathVariable("id") Long id) {
    return leccionServices.obtenerLeccionporId(id);
    }

}
