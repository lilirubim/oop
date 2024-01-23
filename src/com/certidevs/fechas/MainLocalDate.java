package com.certidevs.fechas;

import java.time.LocalDate;

public class MainLocalDate {
    public static void main(String[] args) {

        /*
        LocalDate representa una fecha compuesta por año mes y día
        No incluye tiempo (hora, minuto, segundo)
        */

        LocalDate fechaHoy = LocalDate.now();
        System.out.println(fechaHoy);

        LocalDate fechaInicio = LocalDate.of(2024, 3, 14);
        LocalDate fechaFin = LocalDate.of(2024, 3, 15);

        System.out.println("getDayOfYear " + fechaInicio.getDayOfYear());
        System.out.println("getDayOfMonth " + fechaInicio.getDayOfMonth());

        boolean isBefore = fechaInicio.isBefore(fechaFin);
        System.out.println(fechaInicio + " is Before " + " = " + isBefore);

        boolean isAfter = fechaFin.isAfter(fechaInicio);
        System.out.println(isAfter);

        System.out.println(fechaInicio.getMonthValue());
        System.out.println(fechaInicio.getMonth().getValue());

        // Operadores
        // 1. Crear fecha inicioSuscripcion con fecha de hoy
        LocalDate inicioSuscripcion = LocalDate.now();
        System.out.println(inicioSuscripcion);

        // 2. Crear fecha finSuscripcion con la fecha inicioSuscripcion con 7 días agregados
        System.out.println(inicioSuscripcion.plusWeeks(1));
        // or System.out.println(inicioSuscripcion.plusDays(7));

    }
}
