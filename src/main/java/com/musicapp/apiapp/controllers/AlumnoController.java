package com.musicapp.apiapp.controllers;
import com.musicapp.apiapp.services.AlumnoServices;
import com.musicapp.apiapp.model.AlumnoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
  @Autowired
  AlumnoServices alumnoServices;
  @GetMapping
    public ArrayList<AlumnoModel> getAlumnos(){
        return alumnoServices.ObetenerAlumno();
  }
}


