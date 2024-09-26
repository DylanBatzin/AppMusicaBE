package com.musicapp.apiapp.model;
import jakarta.persistence.*;

@Entity
@Table(name = "academia")
public class AcademiaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_academia;
    private String nombre;

    public Long getId_academia() {
        return this.id_academia;
    }

    public void setId_academia(Long id_academia) {
        this.id_academia = id_academia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
