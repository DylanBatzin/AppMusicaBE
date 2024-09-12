package com.musicapp.apiapp.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import com.musicapp.apiapp.model.AcademiaModel;

@Repository
public interface AcademiaRepository extends CrudRepository<AcademiaModel, Long> {
}
