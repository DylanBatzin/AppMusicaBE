package com.musicapp.apiapp.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.musicapp.apiapp.model.progresoModel;
import com.musicapp.apiapp.repositories.progresoRepository;

import java.util.ArrayList;
@Service
public class progresoServices {
   
    
   @Autowired
    progresoRepository progresoRepository; 
     public ArrayList<progresoModel> Obtenerprogreso(){
        return (ArrayList<progresoModel>) progresoRepository.findAll();
    }
     public progresoModel Guardarprogreso(progresoModel progeso){
        return progresoRepository.save(progeso);
    }

    public ArrayList<progresoModel> obtenerProgresoPorId(Integer idAlumno) {
        return progresoRepository.findByIdAlumno(idAlumno); 
    }
}
