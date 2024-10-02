package com.musicapp.apiapp.model;
import jakarta.persistence.*;
@Entity
@Table(name = "examen")
public class examenModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_examen;
    
    private int id_leccion;
    private String preguntas;
    private String respuestas;
    private String titulo;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId_examen() {
        return this.id_examen;
    }

    public void setId_examen(int id_examen) {
        this.id_examen = id_examen;
    }

    public int getId_leccion() {
        return this.id_leccion;
    }

    public void setId_leccion(int id_leccion) {
        this.id_leccion = id_leccion;
    }

    public String getPreguntas() {
        return this.preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    public String getRespuestas() {
        return this.respuestas;
    }

    public void setRespuestas(String respuestas) {
        this.respuestas = respuestas;
    }
    
}
