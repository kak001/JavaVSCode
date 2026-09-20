package clases_java.c08_oop.abstraction.abstraction_ejercicios;

public class Rectangle extends Shape {
    // Atributos
    private int sideA;
    private int sideB;

    // Constructor
    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // Metodos
    @Override
    public void calculateArea() {
        int rectangleArea = sideA * sideB;

        System.out.println("Lado A: " + sideA);
        System.out.println("Lado B: " + sideB);
        System.out.println("Rectangulo area: " + rectangleArea);
    }
}
