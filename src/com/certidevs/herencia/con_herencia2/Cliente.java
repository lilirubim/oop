package com.certidevs.herencia.con_herencia2;

// Subclase email
public class Cliente extends Usuario {

    // atributos
    private String email;

    //construtor

    public Cliente(String nombre, String apellido, String email) {
        super(nombre, apellido);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
