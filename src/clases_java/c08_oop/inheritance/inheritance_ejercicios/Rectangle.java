package clases_java.c08_oop.inheritance.inheritance_ejercicios;

public class Rectangle extends Shape {
    // Atributos
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // Setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Metodo
    @Override
    public double calculateArea() {
        if (width <= 0 || height <= 0) {
            System.out.println("Error: Datos ingresados no validos. ");
            return -1;
        } else {
            return width * height;
        }
    }
}
