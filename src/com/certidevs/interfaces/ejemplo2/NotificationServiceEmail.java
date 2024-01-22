package com.certidevs.interfaces.ejemplo2;

public class NotificationServiceEmail implements NotificationService {
    @Override
    public void enviarMensaje(String mensaje) {

        System.out.println("Enviando mail: " + mensaje);

    }

    @Override
    public String confirmarEnvioRespuesta(long id) {
        return null;
    }

    @Override
    public void confirmarEnvio(long id) {

    }
}
