package com.certidevs.fechas;

import java.time.LocalTime;

public class MainLocalTime {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        LocalTime horarioEntrada = LocalTime.now();
        System.out.println(horarioEntrada);

        LocalTime horarioSalida = LocalTime.of(18, 30);
        System.out.println(horarioSalida);

        System.out.println(horarioEntrada.getHour());
        System.out.println(horarioEntrada.getMinute());
        System.out.println(horarioEntrada.isBefore(horarioSalida));
        System.out.println(horarioEntrada.withMinute(20));

    }
}
