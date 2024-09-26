package com.musicapp.apiapp.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import com.musicapp.apiapp.model.InstrumentoModel;
@Repository
public interface instrumentoRepository extends CrudRepository<InstrumentoModel, Long> {

    

    
}
