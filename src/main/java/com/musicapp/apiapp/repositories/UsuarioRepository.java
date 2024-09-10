package com.musicapp.apiapp.repositories;

import com.musicapp.apiapp.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long> {
}
