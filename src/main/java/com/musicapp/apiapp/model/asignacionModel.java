package com.musicapp.apiapp.model;
import jakarta.persistence.*;
@Entity
@Table(name = "asignacion")
public class asignacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_asignacion;
    private int leccion;
    private int id_actividad;
    private int id_alumno;

    public int getId_asignacion() {
        return this.id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public int getLeccion() {
        return this.leccion;
    }

    public void setLeccion(int leccion) {
        this.leccion = leccion;
    }

    public int getId_actividad() {
        return this.id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public int getId_alumno() {
        return this.id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

}
