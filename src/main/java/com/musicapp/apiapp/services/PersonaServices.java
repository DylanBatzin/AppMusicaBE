package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.PersonaModel;
import com.musicapp.apiapp.repositories.personaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

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
    public Optional<PersonaModel> ActualizarPersona(Long idpersona, PersonaModel personaModel){
        Optional<PersonaModel> personaencotrada = personaRepository.findById(idpersona);
        if(personaencotrada.isPresent()){
            PersonaModel personaActualizada = personaencotrada.get();
            personaActualizada.setNombre(personaModel.getNombre());
            personaActualizada.setApellido(personaModel.getApellido());
            return Optional.of(personaRepository.save(personaActualizada));
        }else{
            return Optional.empty();
        }
    }
    public Optional<PersonaModel> obtenerPersonaPorId(Long id) {
        return personaRepository.findById(id);
    }
    
}
