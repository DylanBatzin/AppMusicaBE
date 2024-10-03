package com.musicapp.apiapp.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import com.musicapp.apiapp.model.asignacionModel;
import java.util.ArrayList;
@Repository
public interface asignacionesRepository extends CrudRepository<asignacionModel, Long>{

    ArrayList<asignacionModel> findByIdAlumno(Integer idAlumno);


    
}
