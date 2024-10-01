package com.musicapp.apiapp.repositories;
import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import com.musicapp.apiapp.model.PersonaModel;
@Repository
public interface personaRepository extends CrudRepository<PersonaModel, Long> {

    ArrayList<PersonaModel> findByIdAcademiaAndTipo(int idAcademia, String tipo);


    
}
