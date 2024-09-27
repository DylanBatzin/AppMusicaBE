package com.musicapp.apiapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.musicapp.apiapp.services.ActividadesServices;
import com.musicapp.apiapp.model.ActividadesModel;
import java.util.ArrayList;

@RestController
@RequestMapping("/actividad")
public class ActividadesController {
    @Autowired
    ActividadesServices actividadesServices;
    @GetMapping
    public ArrayList<ActividadesModel> obteneractividad(){
    return actividadesServices.ObtenerActividad();
    }  
     @PostMapping()
    public ActividadesModel guardaractividad(@RequestBody ActividadesModel actividad){
        return actividadesServices.GuardarActividad(actividad);
    }
}
