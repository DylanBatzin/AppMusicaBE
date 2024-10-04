package com.musicapp.apiapp.repositories;
import com.musicapp.apiapp.model.progresoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
@Repository
public interface progresoRepository extends CrudRepository<progresoModel, Long> {

    ArrayList<progresoModel> findByIdAlumno(Integer idAlumno); 
    
}
