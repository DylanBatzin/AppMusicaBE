package com.musicapp.apiapp.model;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;
    private String email;
    private String tipo;
    private int academia_id;
    private String password;

    public String getPasword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
   // Getter para id
   public Long getId() {
    return id;
}

// Setter para id
public void setId(Long id) {
    this.id = id;
}

// Getter para nombre
public String getNombre() {
    return nombre;
}

// Setter para nombre
public void setNombre(String nombre) {
    this.nombre = nombre;
}

// Getter para email
public String getEmail() {
    return email;
}

// Setter para email
public void setEmail(String email) {
    this.email = email;
}

// Getter para tipo
public String getTipo() {
    return tipo;
}

// Setter para tipo
public void setTipo(String tipo) {
    this.tipo = tipo;
}

// Getter para academia_id
public int getAcademia_id() {
    return academia_id;
}

// Setter para academia_id
public void setAcademia_id(int academia_id) {
    this.academia_id = academia_id;
}
}
