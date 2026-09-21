package clases_java.c08_oop.inheritance.inheritance_ejercicios;

public class Circle extends Shape {
    // Atributo
    private double radio;

    // Constructor
    public Circle(double radio) {
        this.radio = radio;
    }

    // Getter
    public double getRadio() {
        return radio;
    }

    // Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Metodo
    @Override
    public double calculateArea() {
        if (radio <= 0) {
            System.out.println("Error: Datos ingresados no validos. ");
            return -1;
        } else {
            return Math.PI * radio * radio;
        }
    }
}
