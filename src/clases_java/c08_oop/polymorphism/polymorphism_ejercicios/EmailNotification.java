package clases_java.c08_oop.polymorphism.polymorphism_ejercicios;

public class EmailNotification extends Notification{
    // Metodo
    @Override
    public void send() {
        System.out.println("Se ha enviado un email a un usuario.");
    }
}
