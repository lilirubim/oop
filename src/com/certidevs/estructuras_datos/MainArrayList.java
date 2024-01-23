package com.certidevs.estructuras_datos;

import java.util.ArrayList;

public class MainArrayList {

    public static void main(String[] args) {

        ArrayList cosas = new ArrayList();

        cosas.add("producto1");
        cosas.add("producto2");
        cosas.add(50.4);
        cosas.add(true);

        ArrayList<String> frases = new ArrayList<>();
        frases.add("Hola");
        frases.add("Adios");
        frases.add("Parse");
        frases.add("Silvia");
        boolean adiosIsContained = frases.contains("Adios");
        System.out.println(adiosIsContained);
        System.out.println(frases.size()); // tamaño del Array

        ArrayList<Double> precios = new ArrayList<>();
        int numero = 4;
        precios.add(4.0);
        precios.add((double) numero);
        precios.add(5.99);
        precios.add(7.99);
        precios.add(8.99);

        ArrayList<Character> abecedario = new ArrayList<>();
        abecedario.add('a');
        abecedario.add('b');
        abecedario.add('c');
        System.out.println(abecedario.size());
        abecedario.getFirst();

        ArrayList<Producto> productos = new ArrayList<>();
        Producto televisor = new Producto("televisor", 500.99);
        productos.add(televisor);
        productos.add(new Producto("silla", 399.99));
        productos.add(new Producto("ordenador", 699.99));


    }
}
