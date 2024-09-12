package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.AcademiaModel;
import com.musicapp.apiapp.repositories.AcademiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;
@Service
public class AcademiaServices {
    @Autowired
    AcademiaRepository academiaRepository;

    public ArrayList<AcademiaModel> ObtenerAcademia(){
        return (ArrayList<AcademiaModel>) academiaRepository.findAll();
    }
     public AcademiaModel guardarAcademia(AcademiaModel academia){
        return academiaRepository.save(academia);
    }

    public Optional<AcademiaModel> actualizarAcademia(Long id, AcademiaModel nuevoModel){
        Optional<AcademiaModel> academiaEcnontrado = academiaRepository.findById(id);
        if(academiaEcnontrado.isPresent()){
            AcademiaModel academiaActualizada = academiaEcnontrado.get();
            academiaActualizada.setNombre(nuevoModel.getNombre());
            return Optional.of(academiaRepository.save(academiaActualizada));
        }
        else{
            return Optional.empty();
        }
    }
    public boolean eliminarAcademia(Long id){
        try{
            academiaRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
