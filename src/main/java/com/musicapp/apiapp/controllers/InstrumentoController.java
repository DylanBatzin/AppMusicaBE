package com.musicapp.apiapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.musicapp.apiapp.services.InstrumentoServices;
import com.musicapp.apiapp.model.InstrumentoModel;
import java.util.ArrayList;

@RestController
@RequestMapping("/instrumento")
public class InstrumentoController {
    @Autowired
    InstrumentoServices instrumentoServices;
    @GetMapping
    public ArrayList<InstrumentoModel> obtenerinstrumento(){
    return instrumentoServices.ObtenerInstrumento();
    }  
     @PostMapping()
    public InstrumentoModel guardarinstrumento(@RequestBody InstrumentoModel instrumento){
        return instrumentoServices.GuardarInstrumento(instrumento);
    }
}
