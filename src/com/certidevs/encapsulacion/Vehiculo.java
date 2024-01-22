package com.certidevs.encapsulacion;

import java.util.List;

public class Vehiculo {


    // atributos
    private String modelo;
    private int velocidad;
    private double peso;

    private List<String> modelosDisponibles = List.of(
            "BMW",
            "Mercedes",
            "Audi"
    );

    // constructores
    public Vehiculo() {}

    public Vehiculo(String modelo, int velocidad, double peso) {
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.peso = peso;
    }

    // mètodos getter y setter

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (!checkEngine())
            return;
        //bucle for que itere sobre modelos disponibles
        for (String modeloDisponible: modelosDisponibles) {
            if (modelo.contains(modeloDisponible)) {
                this.modelo = modelo;
                break;
            }

        }

    }

    /*
    Creamos métodos privados para delegar en ellos cierto comportamiento
    que forma parte de un porceso más grande
     */
    private boolean checkEngine() {
        return true;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        if(velocidad >= 0 && velocidad <=120)
        this.velocidad = velocidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    // metodo toString
}
