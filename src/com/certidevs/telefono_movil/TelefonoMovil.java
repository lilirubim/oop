package com.certidevs.telefono_movil;

public class TelefonoMovil {

    // atributos

    String fabricante;
    String modelo;
    int numCores;
    int ram;
    boolean encendido;

    // metodos constructores
    public TelefonoMovil() {

    }

    public TelefonoMovil(String fabricante, String modelo, int numCores, int ram, boolean encendido) {
        // si el nombre
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.numCores = numCores;
        this.ram = ram;
        this.encendido = encendido;
    }

    // metodo encender
    public void encender() {
        if (this.numCores > 0 && this.ram > 0) // Si hay memoria y procesador encendemos el movil
            this.encendido = true;
    }

    // metodo apagar

    public void apagar() {
        // if(encendido) comprueba si es true, entonces lo pone a false, pero se puede poner a false igualmente
            encendido = false;
    }

    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numCores=" + numCores +
                ", ram=" + ram +
                ", encendido=" + encendido +
                '}';
    }

}
