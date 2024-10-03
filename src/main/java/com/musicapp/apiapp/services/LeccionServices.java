package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.LeccionModel;
import com.musicapp.apiapp.repositories.leccionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class LeccionServices {
    @Autowired
    leccionRepository leccionRepository;

    public ArrayList<LeccionModel> ObtenerLeccion(){
        return (ArrayList<LeccionModel>) leccionRepository.findAll();
    }
     public LeccionModel GuargarLeccion(LeccionModel leccion){
        return leccionRepository.save(leccion);
    }

    public Optional<LeccionModel> obtenerLeccionporId(Long id){
        return leccionRepository.findById(id);
    }
}
