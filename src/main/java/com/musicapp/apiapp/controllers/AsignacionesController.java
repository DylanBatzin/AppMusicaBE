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

    @GetMapping("/alumno/{idAlumno}")
    public ArrayList<asignacionModel> obtenerAsignacionPorAlumno(@PathVariable("idAlumno") Integer idAlumno) {
        return asignacionesServices.ObtenerAsignacionPorAlumno(idAlumno);
    }

    @DeleteMapping(path = "/asiganciondelete/{id}")
    public String eliminarAsignacion(@PathVariable("id") Long id) {
        boolean ok = asignacionesServices.eliminarasignacion(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No se pudo eliminar el usuario con id " + id;
        }
    }
    
}
