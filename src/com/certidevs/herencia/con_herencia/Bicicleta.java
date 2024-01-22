package com.certidevs.herencia.con_herencia;

// Heredar de la clase Vehiculo
public class Bicicleta extends Vehiculo{

    // atributos
    private String materiales;
    private boolean suspensionDelantera;
    private boolean suspensionTrasera;


    //Construtor con todos los parametros: 3 de Bicicleta y tres de Vehiculo

        public Bicicleta(String fabricante, String modelo, int numRuedas, String materiales, boolean suspensionDelantera, boolean suspensionTrasera) {
        super(fabricante, modelo, numRuedas);
        //super es una palabra reservada ara acceder a elementos de la clase superior
        System.out.println("Bicicleta constructor 6 params");

        // 3 parametros de Bicicleta
        this.materiales = materiales;
        this.suspensionDelantera = suspensionDelantera;
        this.suspensionTrasera = suspensionTrasera;
    }

    //Constructor sin parametros
    public Bicicleta() {
    }

    // Getter y Setter
    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public boolean isSuspensionDelantera() {
        return suspensionDelantera;
    }

    public void setSuspensionDelantera(boolean suspensionDelantera) {
        this.suspensionDelantera = suspensionDelantera;
    }

    public boolean isSuspensionTrasera() {
        return suspensionTrasera;
    }

    public void setSuspensionTrasera(boolean suspensionTrasera) {
        this.suspensionTrasera = suspensionTrasera;
    }
}
