package com.certidevs.encapsulacion;
/*
Clase de constantes y métodos de utilidad
 */
public class Constantes {

    //constante
    public static final double PRECIO_DIESEL = 1.33;
    public static final double IVA = 1.21;
    private static String MENSAJE = "Calculando precio";

    // metodos static
    public static double calcularCombustible(){
       return PRECIO_DIESEL * IVA;
    }

    // constructor privado para evitar instanciar esta clase
    private Constantes() {}
}
