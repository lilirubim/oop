package com.certidevs.interfaces.ejemplo2;

public class UserRegistration {

    // atributos
    public NotificationService notificador;

    // constructores

    public UserRegistration(NotificationService notificador) {
        this.notificador = notificador;
    }

    // métodos
    public void registrarUsuario(String email) {

        notificador.enviarMensaje("Confirme su cuenta asociada al email " + email);
    }

    // métodos getter y setter
    public NotificationService getNotificador() {
        return notificador;
    }

    public void setNotificador(NotificationService notificador) {
        this.notificador = notificador;
    }



}
