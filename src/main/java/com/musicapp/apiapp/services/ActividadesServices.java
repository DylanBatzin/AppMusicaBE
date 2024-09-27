package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.ActividadesModel;
import com.musicapp.apiapp.repositories.actividadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ActividadesServices {
    @Autowired
    actividadesRepository actividadesRepository;

    public ArrayList<ActividadesModel> ObtenerActividad(){
        return (ArrayList<ActividadesModel>) actividadesRepository.findAll();
    }
     public ActividadesModel GuardarActividad(ActividadesModel actividad){
        return actividadesRepository.save(actividad);
    }
}
