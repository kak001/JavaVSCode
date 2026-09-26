package clases_java.c08_oop.polymorphism.polymorphism_ejercicios;

public class Rectangle extends Shape {
    // Atributos
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Metodo
    @Override
    public double calculateArea() {
        double rectangleArea = width * height;
        return rectangleArea;
    }
}
