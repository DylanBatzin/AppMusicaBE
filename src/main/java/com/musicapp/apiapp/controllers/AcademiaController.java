package com.musicapp.apiapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.musicapp.apiapp.services.AcademiaServices;
import com.musicapp.apiapp.model.AcademiaModel;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/academia")
public class AcademiaController {
    @Autowired
    AcademiaServices academiaServices;
    @GetMapping()
    public ArrayList<AcademiaModel> ObtenerAcademia(){
    return academiaServices.ObtenerAcademia();
    }  
     @PostMapping()
    public AcademiaModel guardarAcademia(@RequestBody AcademiaModel academia){
        return academiaServices.guardarAcademia(academia);
    }

    @PutMapping(path = "/{id}")
    public Optional<AcademiaModel> actualizaracademia(@PathVariable("id") Long id, @RequestBody AcademiaModel academia) {
        return academiaServices.actualizarAcademia(id, academia);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminaracademia(@PathVariable("id") Long id) {
        boolean ok = academiaServices.eliminarAcademia(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id " + id;
        }
    }
}
