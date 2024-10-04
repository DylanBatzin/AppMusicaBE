package com.musicapp.apiapp.model;
import jakarta.persistence.*;

@Entity
@Table(name = "progreso")
public class progresoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_progreso;
    private int id_examen;
    private int punteo;
    private String comentarios;
    @Column(name = "id_alumno")
    private Integer idAlumno;

    public Integer getId_alumno() {
        return this.idAlumno;
    }

    public void setId_alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Long getId_progreso() {
        return this.id_progreso;
    }

    public void setId_progreso(Long id_progreso) {
        this.id_progreso = id_progreso;
    }

    public int getId_examen() {
        return this.id_examen;
    }

    public void setId_examen(int id_examen) {
        this.id_examen = id_examen;
    }

    public int getPunteo() {
        return this.punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }

    public String getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

  
}
