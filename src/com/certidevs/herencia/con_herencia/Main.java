package com.certidevs.herencia.con_herencia;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto Vehiculo
        Vehiculo vehiculoGenerico = new Vehiculo("Ford", "Mondeo", 4);

        // Crear un objeto Bicicleta
        Bicicleta orbea = new Bicicleta("Orbea", "Nivea", 2, "CorchoPalo", false, true);

        // imprimir y depurar
        System.out.println(orbea.getFabricante());

    }
}
