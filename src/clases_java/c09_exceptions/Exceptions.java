package clases_java.c09_exceptions;

public class Exceptions {
    public static void main(String[] args) {

        // Manejo de excepciones

        // try catch
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            message("Error: " + e.getMessage(), RED);
        } finally {
            message("Fin del bloque try-catch", BLUE);
        }
        System.out.println();

        // throw
        var throwExample = new ThrowExample();

        try {
            throwExample.checkAge(15);
        } catch (Exception e) {
            message("Error: " + e.getMessage(), RED);
        }
        System.out.println();

        // Excepciones personalizadas
        try {
            throwExample.checkScore(-2);
        } catch (CustomException e) {
            message("Error: " + e.getMessage(), RED);
        }
    }

    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";

    public static void message(String message, String color) {
        System.out.println(color + message + RESET);
    }
}
