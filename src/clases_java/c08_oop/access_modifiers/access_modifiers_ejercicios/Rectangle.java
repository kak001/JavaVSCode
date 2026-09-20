package clases_java.c08_oop.access_modifiers.access_modifiers_ejercicios;

public class Rectangle {
    // Atributos
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Metodo
    public double calculateArea() {
        double rectangleArea = width * height;
        return rectangleArea;
    }
}
