package com.musicapp.apiapp.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import com.musicapp.apiapp.model.LeccionModel;
@Repository
public interface leccionRepository extends CrudRepository<LeccionModel,Long> {

    

}
