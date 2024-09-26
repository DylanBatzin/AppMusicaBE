package com.musicapp.apiapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario") // Asegúrate de que el nombre coincide con el de la tabla en la BD
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", unique = true, nullable = false)
    private Long idUsuario;

    @Column(name = "`User`", length = 20)
    private String user;

    @Column(name = "Email", length = 60)
    private String email;

    @Column(name = "Password", length = 30)
    private String password;

    // Getters y Setters

    // Getter y Setter para idUsuario
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Getter y Setter para user
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    // Getter y Setter para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter y Setter para password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
