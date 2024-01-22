package com.certidevs.encapsulacion;

public class MainModelo {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();
        v1.setModelo("BMW Serie 4");
        v1.setModelo("Fiat Panda");
        v1.setModelo("Mercedes Clase A");
        v1.setModelo("Volkswagen Polo");
        System.out.println(v1);
    }
}
