package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.MaestroModel;
import com.musicapp.apiapp.repositories.MaestroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class MaestroServices {
    @Autowired
    MaestroRepository maestroRepository;
    public ArrayList<MaestroModel> ObtenerAllMaestros(){
        return (ArrayList<MaestroModel>) maestroRepository.findAll();

    }

}
