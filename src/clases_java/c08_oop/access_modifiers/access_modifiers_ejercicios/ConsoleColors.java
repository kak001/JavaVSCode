package clases_java.c08_oop.access_modifiers.access_modifiers_ejercicios;

public class ConsoleColors {
    // Colores
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    // Constructor privado
    private ConsoleColors() {
        throw new UnsupportedOperationException("No se puede inicializar.");
    }

    // Metodo
    public static void message(String message, String color) {
        System.out.println(color + message + RESET);
    }
}
