package com.musicapp.apiapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.musicapp.apiapp.services.ExamenServices;
import com.musicapp.apiapp.model.examenModel;
import java.util.ArrayList;

@RestController
@RequestMapping("/examen")
public class ExamenController {
    @Autowired
    ExamenServices examenServices;
    @GetMapping
    public ArrayList<examenModel> obtenerexamen(){
    return examenServices.ObtenerExamen();
    }  
     @PostMapping()
    public examenModel guardarexamen(@RequestBody examenModel examen){
        return examenServices.GuardarExamen(examen);
    }
}
