package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.PersonaModel;
import com.musicapp.apiapp.repositories.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class PersonaServices {
    @Autowired
    personaRepository personaRepository;

    public ArrayList<PersonaModel> ObtenerPersona(){
        return (ArrayList<PersonaModel>) personaRepository.findAll();
    }
     public PersonaModel GuardarPersona(PersonaModel academia){
        return personaRepository.save(academia);
    }
    public ArrayList<PersonaModel> ObtenerAlumnosPorAcademia(int idAcademia) {
        return personaRepository.findByIdAcademiaAndTipo(idAcademia, "Alumno");
    }
    public boolean eliminarUsuario(Long id) {
        try {
            personaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
