package clases_java.c10_extras.extras_ejercicios;

public class ConsoleColors {
    // Colores
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET    = "\u001B[0m";

    // Constructor privado
    private ConsoleColors() {
        throw new UnsupportedOperationException("Consola de Colores: No puede inicializarse.");
    }

    // Metodo
    public static void message(String message, String color){
        System.out.println(color + message + RESET);
    }
}
