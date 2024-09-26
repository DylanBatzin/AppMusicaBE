package com.musicapp.apiapp.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;
import com.musicapp.apiapp.model.ActividadesModel;
@Repository
public interface actividadesRepository extends CrudRepository <ActividadesModel, Long> {

    

}
