package com.musicapp.apiapp.model;
import jakarta.persistence.*;
@Entity
@Table(name = "instrumento")
public class InstrumentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_instrumento;
    private String nombre;
    private String descripcion;

    public int getId_instrumento() {
        return this.id_instrumento;
    }

    public void setId_instrumento(int id_instrumento) {
        this.id_instrumento = id_instrumento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
