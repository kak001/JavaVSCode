package clases_java.c08_oop.inheritance.inheritance_ejercicios;

public class Truck extends AnotherVehicle {
    // Metodo
    @Override
    public void describe() {
        System.out.println("Esto es un camion, contiene dos puertas, seis ruedas, un container para transportar material pesado, un motor grande y un dueño.");
    }
}
