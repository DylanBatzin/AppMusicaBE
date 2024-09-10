package com.musicapp.apiapp.model;
import jakarta.persistence.*;
@Entity
@Table(name = "maestro")
public class MaestroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_maestro;
    private int id_usuario;

    public int getId_maestro() {
        return id_maestro;
    }

    public void setId_maestro(int id_maestro) {
        this.id_maestro = id_maestro;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
