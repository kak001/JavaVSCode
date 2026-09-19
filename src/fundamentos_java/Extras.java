package fundamentos_java;
import java.util.Scanner;

public class Extras {
    static String globalName = "kako";
    public static void main(String[] args) {
        // Extras

        // null
        /* forma de representar que una variable esta vacia o no tiene algun valor */

        String name = "kako";
        name = null;

        try {
            System.out.println(name.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // import
        /* manera de pedir o solicitar clases, subclases o herramientas de java */

        // Scanner
        /* herramienta cual le pide datos al usuario */

        var scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        var age = scanner.nextInt();

        System.out.println("Edad: " + age + " años.");
        System.out.println();
        scanner.close();

        // Scope: veriable global o local
        showName();
        System.out.println();

        // static
        /* al ser static una funcion o variables no es necesario inicializarla */
    }

    public static void showName() {
        System.out.println(globalName);
    }
}
