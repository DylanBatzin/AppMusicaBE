package com.musicapp.apiapp.controllers;

import com.musicapp.apiapp.model.UsuarioModel;
import com.musicapp.apiapp.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
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
}
