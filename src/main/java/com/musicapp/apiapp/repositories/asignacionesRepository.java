package com.musicapp.apiapp.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import com.musicapp.apiapp.model.asignacionModel;
@Repository
public interface asignacionesRepository extends CrudRepository<asignacionModel, Long>{

    

    
}