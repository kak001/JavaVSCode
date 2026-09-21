package clases_java.c08_oop.classes.classes_ejercicios;

public class Rectangle {
    // Metodos
    public int calculateArea(int width, int height) {
        if (width <= 0 || height <= 0) {
            System.out.println("Error: Datos de medida invalidos.");
            return -1;
        } else {
            return width * height;
        }
    }

    public int calculatePerimeter(int width, int height) {
        if (width <= 0 || height <= 0) {
            System.out.println("Error: Datos de medida invalidos.");
            return -1;
        } else {
            return 2 * (width + height);
        }
    }
}
