package com.musicapp.apiapp.services;
import com.musicapp.apiapp.model.UsuarioModel;
import com.musicapp.apiapp.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;
@Service
public class UsuarioServices {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> actualizarUsuarios(Long id, UsuarioModel nuevoModel){
        Optional<UsuarioModel> usuarioEcnontrado = usuarioRepository.findById(id);
        if(usuarioEcnontrado.isPresent()){
            UsuarioModel usuarioActualizado = usuarioEcnontrado.get();
            usuarioActualizado.setEmail(nuevoModel.getEmail());
            usuarioActualizado.setUser(nuevoModel.getUser());
            usuarioActualizado.setPassword(nuevoModel.getPassword());
            return Optional.of(usuarioRepository.save(usuarioActualizado));
        }
        else{
            return Optional.empty();
        }
    }
    public boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
