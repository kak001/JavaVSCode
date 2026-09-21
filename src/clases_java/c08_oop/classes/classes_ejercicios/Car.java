package clases_java.c08_oop.classes.classes_ejercicios;

public class Car {
    // Atributos
    private String brand;
    private String model;

    // Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Metodo
    public void showData() {
        System.out.println("Marca: " + brand + " | modelo: " + model);
    }
}
