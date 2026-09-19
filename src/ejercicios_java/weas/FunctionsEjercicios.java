package Java.src.ejercicios_java.weas;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsEjercicios {
    public static void main(String[] args) {

        // 1.
        sayHi();
        System.out.println();

        // 2.
        sayHiName("kako");
        System.out.println();

        // 3.
        System.out.println(subtraction(4, 2));
        System.out.println();

        // 4.
        numberSquare2(5);
        System.out.println();

        // 5.
        pairNotPair(2);
        System.out.println();

        // 6.
        System.out.println(ageChecker(20));
        System.out.println();

        // 7.
        System.out.println(stringMeter("kako"));
        System.out.println();

        // 8.
        Integer[] arrayNumbers = {2, 20, 67, 100};
        System.out.println(arrayAverage(arrayNumbers));
        System.out.println();

        // 9.
        System.out.println(factorialNumber(4));
        System.out.println();

        // 10.
        var stringNames = new ArrayList<String>(Arrays.asList("kako", "joako", "Joaquin"));
        showNames(stringNames);
        System.out.println();
    }

    // 1.
    public static void sayHi() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2.
    public static void sayHiName(String name) {
        System.out.println("Hola " + name + "!");
    }

    // 3.
    public static int subtraction(int a, int b) {
        return a - b;
    }

    // 4.
    public static void numberSquare2(int a) {
        int square = a*a;
        System.out.println("El cuadrado del numero " + a + " es: " + square );
    }

    // 5.
    public static void pairNotPair(int a) {
        if (a % 2 == 0) {
            System.out.println("El numero " + a + " es par");
        } else {
            System.out.println("El numero " + a + " es impar");
        }
    }

    // 6.
    public static boolean ageChecker(int age) {
        if (age >= 18) {
            System.out.println("La edad del usuario es mayor de edad");
            return true;
        }
        System.out.println("La edad del usuario es menor de edad");
        return false;
    }

    // 7.
    public static int stringMeter(String string) {
        return string.length();
    }

    // 8.
    public static int arrayAverage(Integer[] numbers) {
        int plusTotal = 0;
        for (int indexA = 0; indexA < numbers.length; indexA++) {
            plusTotal += numbers[indexA];
        }
        int totalNumbers = plusTotal / numbers.length;
        return totalNumbers;
    }

    // 9.
    public static int factorialNumber(int a) {
        int factorial = 1;
        for (int index = 1; index <= a; index++) {
            factorial *= index;
        }
        return factorial;
    }

    // 10.
    public static void showNames(ArrayList<String> names) {
        for (String stringNamesA:names) {
            System.out.println(stringNamesA);
        }
    }

}
