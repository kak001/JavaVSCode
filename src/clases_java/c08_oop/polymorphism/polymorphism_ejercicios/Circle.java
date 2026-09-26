package clases_java.c08_oop.polymorphism.polymorphism_ejercicios;

public class Circle extends Shape {
    // Atributos
    private double radio;

    // Constructor
    public Circle(double radio) {
        this.radio = radio;
    }

    // Metodo
    @Override
    public double calculateArea() {
        double circleArea = Math.PI * radio *radio;
        return circleArea;
    }
}
