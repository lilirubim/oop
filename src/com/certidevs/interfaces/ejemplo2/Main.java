package com.certidevs.interfaces.ejemplo2;

public class Main {
    // interfaz: Spring inyectaria aqui un objeto
    static NotificationService notificationService;

    public static void main(String[] args) {

        notificationService = new NotificationServiceEmail();
        notificationService.confirmarEnvio(1);
        notificationService.enviarMensaje("Hola");

        NotificationService notificadorEMAIL = new NotificationServiceEmail();
        NotificationService notificadorSMS = new NotificationServiceSMS();

        //La interfaz permite desacoplar la clase UserRegistration del sistema de notificaciones
        //Permite pasar un sistema u otro y en ambos funciona
        UserRegistration userRegistration = new UserRegistration(notificadorEMAIL);
        userRegistration.registrarUsuario("juanito@email.com");

    }
    /*
    class AltaUsuarios
    class NotificationService

    Paso 1: class UserRegistration
    atributo NotificationService
    método registrar Usuario

    Paso 2: Main crear userRegistration con notificaciones Email
            Main crear userRegistration con notificaciones SMS
     */
}
