package com.musicapp.apiapp.model;
import jakarta.persistence.*;
@Entity
@Table(name = "leccion")
public class LeccionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_leccion;
    private int id_instrumento;
    private String link;

    public int getId_leccion() {
        return this.id_leccion;
    }

    public void setId_leccion(int id_leccion) {
        this.id_leccion = id_leccion;
    }

    public int getId_instrumento() {
        return this.id_instrumento;
    }

    public void setId_instrumento(int id_instrumento) {
        this.id_instrumento = id_instrumento;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
