package com.certidevs.telefono_movil;

public class Main {

    public static void main(String[] args) {

        // Crear objeto constructor vacio

        TelefonoMovil iphone = new TelefonoMovil();
        System.out.println(iphone);

        iphone.fabricante = "Apple";
        System.out.println(iphone);

        iphone.modelo = "iPhone 15";
        System.out.println(iphone);

        // Crear objeto constructor con paramentro

        TelefonoMovil onePlus = new TelefonoMovil("OnePlus", "13T", 6, 8, false);
        TelefonoMovil oppo = new TelefonoMovil("Oppo", "B12", 8, 16, true);

        System.out.println(onePlus);

        onePlus.encender();
        System.out.println(onePlus);

        onePlus.apagar();
        System.out.println(onePlus);

        boolean esTelefono = onePlus instanceof TelefonoMovil;
        System.out.println(esTelefono);
    }
}
