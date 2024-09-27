package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.InstrumentoModel;
import com.musicapp.apiapp.repositories.instrumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class InstrumentoServices {
    @Autowired
    instrumentoRepository instrumentoRepository;

    public ArrayList<InstrumentoModel> ObtenerInstrumento(){
        return (ArrayList<InstrumentoModel>) instrumentoRepository.findAll();
    }
     public InstrumentoModel GuardarInstrumento(InstrumentoModel instrumento){
        return instrumentoRepository.save(instrumento);
    }
}
