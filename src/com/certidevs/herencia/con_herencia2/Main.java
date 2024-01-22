package com.certidevs.herencia.con_herencia2;

public class Main {

    public static void main(String[] args) {

        Usuario user = new Usuario("Lili", "Rubim");
        user.setApellido("de Oliveira");

        System.out.println(user.getApellido());

        Empleado empleado1 = new Empleado("Yessi", "Cherrez", "8934784939");
        System.out.println(empleado1);

    }
}
