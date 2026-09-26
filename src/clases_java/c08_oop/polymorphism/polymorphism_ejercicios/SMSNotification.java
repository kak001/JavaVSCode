package clases_java.c08_oop.polymorphism.polymorphism_ejercicios;

public class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Se ha enviado un SMS a un usuario.");
    }
}
