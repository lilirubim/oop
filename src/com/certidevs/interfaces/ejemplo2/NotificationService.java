package com.certidevs.interfaces.ejemplo2;

/*
TODO
Crear una clase NotificationServiceSMS
Crear una clase NotificationServiceEmail
Crear um main e invocar el método enviarMensaje
Agregar un nuevo método en la interface y ver qué ocurre
 */
public interface NotificationService {

    void enviarMensaje(String mensaje);

    String confirmarEnvioRespuesta(long id);

    void confirmarEnvio(long id);
}
