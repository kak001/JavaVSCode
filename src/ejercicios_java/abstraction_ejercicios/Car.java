package abstraction_ejercicios;

public class Car implements Movable {
    // Atributos
    private double maxSpeed;

    // Constructor
    public Car(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Metodos
    @Override
    public void move() {
        System.out.println("El automovil se esta moviendo a una velocidad maxima de: " + maxSpeed + " km/h.");
    }
}
