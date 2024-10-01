package com.musicapp.apiapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.musicapp.apiapp.model.PersonaModel;
import com.musicapp.apiapp.services.PersonaServices;
import java.util.ArrayList;

@RestController
@RequestMapping("/persona")
public class PersonaController {
     @Autowired
    PersonaServices personaServices;
    @GetMapping
    public ArrayList<PersonaModel> obtenerpersona(){
    return personaServices.ObtenerPersona();
    }  
     @PostMapping()
    public PersonaModel guardarpersona(@RequestBody PersonaModel persona){
        return personaServices.GuardarPersona(persona);
    }

    @GetMapping("/alumnosPorAcademia")
    public ArrayList<PersonaModel> obtenerAlumnosPorAcademia(@RequestParam("idAcademia") int idAcademia) {
        return personaServices.ObtenerAlumnosPorAcademia(idAcademia);
    }

    @DeleteMapping(path = "/personadelete/{id}")
    public String eliminarUsuario(@PathVariable("id") Long id) {
        boolean ok = personaServices.eliminarUsuario(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No se pudo eliminar el usuario con id " + id;
        }
    }
}
