package com.musicapp.apiapp.repositories;
import com.musicapp.apiapp.model.AlumnoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

public interface AlumnoRepository extends CrudRepository<AlumnoModel, Long> {
}
