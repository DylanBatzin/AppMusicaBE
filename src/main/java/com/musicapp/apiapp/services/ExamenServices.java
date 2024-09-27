package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.examenModel;
import com.musicapp.apiapp.repositories.examenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class ExamenServices {
    @Autowired
    examenRepository examenRepository;

    public ArrayList<examenModel> ObtenerExamen(){
        return (ArrayList<examenModel>) examenRepository.findAll();
    }
     public examenModel GuardarExamen(examenModel examen){
        return examenRepository.save(examen);
    }
}
