package com.certidevs.encapsulacion;

public class Main {

    public static void main(String[] args) {

        Vehiculo v1 = new Vehiculo();

        /*
        Atributos están encapsulados (private)
        no se pueden acceder desde fuera de la clase
        de forma directa
         */
       // v1.velocidad = 200;
      //  v1.velocidad = -50;


        // Mètodos get / getter
        v1.getVelocidad();


        // Métodos set / setter

        v1.setVelocidad(110);
        v1.setVelocidad(150);

        System.out.println(v1);


    }
}
