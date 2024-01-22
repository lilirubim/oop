package com.certidevs.herencia.sin_herencia;

public class Vehiculo {

    // atributos
    private String fabricante;
    private String modelo;
    private int numRuedas;

    //constructores
    public Vehiculo(String fabricante, String modelo, int numRuedas) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numRuedas = numRuedas;
    }

    // getter y setter
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }



}
