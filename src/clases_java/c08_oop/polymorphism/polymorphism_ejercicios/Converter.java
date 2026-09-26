package clases_java.c08_oop.polymorphism.polymorphism_ejercicios;

public class Converter {
    // Metodos
    public String convert(int number) {
        return "Entero convertido: " + number;
    }

    public String convert(double number) {
        return "Decimal convertido: " + String.format("%.2f", number);
    }

    public String convert(String text) {
        return "Texto a mayusculas: " + text.toUpperCase();
    }
}
