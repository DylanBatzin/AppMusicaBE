package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.asignacionModel;
import com.musicapp.apiapp.repositories.asignacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AsignacionesServices {
    @Autowired
    asignacionesRepository asignacionesRepository;

    public ArrayList<asignacionModel> ObtenerAsignacion(){
        return (ArrayList<asignacionModel>) asignacionesRepository.findAll();
    }
     public asignacionModel GuardarAsignacion(asignacionModel asignacion){
        return asignacionesRepository.save(asignacion);
    }
}
