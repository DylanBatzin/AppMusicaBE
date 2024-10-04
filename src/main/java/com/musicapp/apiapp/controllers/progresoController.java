package com.musicapp.apiapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;


import com.musicapp.apiapp.model.progresoModel;
import com.musicapp.apiapp.services.progresoServices;
@RestController
@RequestMapping("/progreso")
public class progresoController {
    @Autowired 
    progresoServices progresoServices;
     @GetMapping
    public ArrayList<progresoModel> ObtenerProgreso(){
    return progresoServices.Obtenerprogreso();
    }  
     @PostMapping()
    public progresoModel GuardarProgreso(@RequestBody progresoModel progeso){
        return progresoServices.Guardarprogreso(progeso);
    }

    @GetMapping("/alumno/{idAlumno}")
    public ArrayList<progresoModel> obtenerporgreso(@PathVariable("idAlumno") Integer idAlumno){
        return progresoServices.obtenerProgresoPorId(idAlumno);
    }

}
