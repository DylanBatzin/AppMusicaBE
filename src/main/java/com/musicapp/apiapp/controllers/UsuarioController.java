package com.musicapp.apiapp.controllers;

import com.musicapp.apiapp.model.UsuarioModel;
import com.musicapp.apiapp.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioServices usuarioServices;
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
         return usuarioServices.obtenerUsuarios();
     }
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioServices.guardarUsuario(usuario);
    }

    @PutMapping(path = "/{id}")
    public Optional<UsuarioModel> actualizarUsuario(@PathVariable("id") Long id, @RequestBody UsuarioModel usuario) {
        return usuarioServices.actualizarUsuarios(id, usuario);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUsuario(@PathVariable("id") Long id) {
        boolean ok = usuarioServices.eliminarUsuario(id);
        if (ok) {
            return "Se eliminó el usuario con id " + id;
        } else {
            return "No pudo eliminar el usuario con id " + id;
        }
    }
}
