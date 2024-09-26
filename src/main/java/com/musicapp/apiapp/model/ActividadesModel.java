package com.musicapp.apiapp.model;
import jakarta.persistence.*;
@Entity
@Table(name = "actividades")
public class ActividadesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_actividad;
    private int id_instrumento;
    private String titulo;
    private String descripcion;

    public int getId_actividad() {
        return this.id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public int getId_instrumento() {
        return this.id_instrumento;
    }

    public void setId_instrumento(int id_instrumento) {
        this.id_instrumento = id_instrumento;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
