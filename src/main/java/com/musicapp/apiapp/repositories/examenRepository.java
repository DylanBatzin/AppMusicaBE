package com.musicapp.apiapp.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import com.musicapp.apiapp.model.examenModel;
@Repository
public interface examenRepository extends CrudRepository <examenModel, Long> {


    
}
