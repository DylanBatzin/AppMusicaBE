package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.AlumnoModel;
import com.musicapp.apiapp.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class AlumnoServices {
    @Autowired
    AlumnoRepository alumnoRepository;
     public ArrayList<AlumnoModel> ObetenerAlumno(){
         return (ArrayList<AlumnoModel>) alumnoRepository.findAll();
     }
}
