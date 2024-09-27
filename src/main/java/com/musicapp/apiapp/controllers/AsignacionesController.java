package com.musicapp.apiapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.musicapp.apiapp.services.AsignacionesServices;
import com.musicapp.apiapp.model.asignacionModel;
import java.util.ArrayList;

@RestController
@RequestMapping("/asignaciones")
public class AsignacionesController {
    @Autowired
    AsignacionesServices asignacionesServices;
    @GetMapping
    public ArrayList<asignacionModel> obtenerasignacion(){
    return asignacionesServices.ObtenerAsignacion();
    }  
     @PostMapping()
    public asignacionModel guardarasignacion(@RequestBody asignacionModel asignacion){
        return asignacionesServices.GuardarAsignacion(asignacion);
    }
}
