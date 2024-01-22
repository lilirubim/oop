package com.certidevs.interfaces.ejemplo1;

public class Main {

    public static void main(String[] args) {

        // Utilizar un cliente CRUD

        ClienteCRUD operacionesCRUD = new ClienteCRUDarray();
        //or ClienteCRUD operacionesCRUD = new ClienteCRUDImpl();

        String cliente = operacionesCRUD.buscarPorNif("11122233G");
        System.out.println(cliente);
    }
}
