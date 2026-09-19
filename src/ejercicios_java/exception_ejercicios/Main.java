package Java.src.ejercicios_java.exception_ejercicios;
public class Main {
    public static void main(String[] args) {
        // Ejercicios 
        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        var numberA = 10;
        var numberB = 0;

        try {
            var resultAB = numberA / numberB;
            System.out.println("Resultado AB: " + resultAB);
        } catch (ArithmeticException e) {
            System.out.println("Error 1: " + e.getMessage());
        }
        System.out.println();

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        int[] numbers = {2, 20, 100};

        try {
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error 2: " + e.getMessage());
        }
        System.out.println();

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        String varString = null;

        try {
            System.out.println(varString.length());
        } catch (NullPointerException e) {
            System.out.println("Error 3: " + e.getMessage());
        }
        System.out.println();

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
        try {
            textToNumber("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error 4: " + e.getMessage());
        }
        System.out.println();

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        var name = "kako";

        try {
            name = null;
            System.out.println(name.toUpperCase());
        } catch (Exception e) {
            System.out.println("Error 5: " + e.getMessage());
        } finally {
            System.out.println("Fin del bloque try-catch.");
        }
        System.out.println();

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        try {
            positiveNumberChecker(-2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        var throwTemp = new TemperatureChecker();

        try {
            throwTemp.temperatureChecker(451);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        var numberC = 21;
        String[] names = {"kako", "joako", "Joaquin"};

        try {
            var resultC = numberC / 3;
            System.out.println(resultC);

            System.out.println(names[4]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
        var throwPasswordChecker = new PasswordChecker();

        try {
            throwPasswordChecker.passwordChecker("hol123");
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        var username = "kak001";
        var usernamePassword = "hola12345";
        var throwLoginSystem = new LoginSystem();

        try {
            throwLoginSystem.userCheck("kako", username);
            throwLoginSystem.passwordChecker("hola12345", usernamePassword);
        } catch (LoginFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Metodos
    public static void textToNumber(String text) {
        System.out.println(Integer.parseInt(text));
    }

    public static void positiveNumberChecker(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Numero no valido");
        }
    }
}
