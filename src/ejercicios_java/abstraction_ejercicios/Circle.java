package Java.src.ejercicios_java.abstraction_ejercicios;

public class Circle extends Shape {
    // Atributos
    private int radio;

    // Constructor
    public Circle(int radio) {
        this.radio = radio;
    }

    // Metodos
    @Override
    public void calculateArea() {
        double circleArea = Math.PI * radio*radio;

        System.out.println("Radio del circulo: " + radio);
        System.out.println("Area del circulo: " + circleArea);
    }
}
