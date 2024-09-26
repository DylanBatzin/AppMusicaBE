package com.musicapp.apiapp.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import com.musicapp.apiapp.model.PersonaModel;
@Repository
public interface personaRepository extends CrudRepository<PersonaModel, Long> {

    

    
}
