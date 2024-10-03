package com.musicapp.apiapp.model;
import jakarta.persistence.*;
@Entity
@Table(name = "asignacion")
public class asignacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_asignacion;

    public int getId_asignacion() {
        return this.id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    @Column(name = "id_leccion")
    private Integer leccion;
    private Integer id_actividad;
    @Column(name = "id_alumno")
    private Integer idAlumno;

    public Integer getIdAlumno() {
    return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
    }

    public Integer getLeccion() {
        return this.leccion;
    }

    public void setLeccion(Integer leccion) {
        this.leccion = leccion;
    }

    public Integer getId_actividad() {
        return this.id_actividad;
    }

    public void setId_actividad(Integer id_actividad) {
        this.id_actividad = id_actividad;
    }

   
    @Column(name = "id_examen")
    private Integer id_examen;

    public Integer getId_examen() {
        return this.id_examen;
    }

    public void setId_examen(Integer id_examen) {
        this.id_examen = id_examen;
    }

   
}
