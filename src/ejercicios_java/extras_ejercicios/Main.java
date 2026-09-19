package extras_ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Main {
    // Variable global 
    static String message = "Hello Java!";
    public static void main(String[] args) {
        // Ejercicios
        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
        String thing = null;

        if (thing != null) {
            ConsoleColors.message(thing, ConsoleColors.GREEN);
        } else {
            ConsoleColors.message("La variable esta vacia.", ConsoleColors.RED);
        }
        System.out.println();

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        var scanner = new Scanner(System.in);

        ConsoleColors.message("Ingresa tu nombre: ", ConsoleColors.GREEN);
        var name = scanner.nextLine();

        ConsoleColors.message("Ingresa tu edad: ", ConsoleColors.GREEN);
        var age = scanner.nextInt();

        ConsoleColors.message("El usuario se llama " + name + " de " + age + " años de edad." , ConsoleColors.BLUE);
        System.out.println();

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        final int MAX_SCORE = 100;

        ConsoleColors.message("Puntaje maximo: " + MAX_SCORE, ConsoleColors.YELLOW);
        System.out.println();

        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        var message = "Hello Java!";

        ConsoleColors.message(message, ConsoleColors.GREEN);
        ConsoleColors.message(Main.message, ConsoleColors.RED);
        System.out.println();

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        ConsoleColors.message("Ingresa un numero: ", ConsoleColors.GREEN);
        var number = scanner.nextInt();

        if (number > 0) {
            ConsoleColors.message("El numero " + number + " es positivo.", ConsoleColors.GREEN);
        } else if (number == 0) {
            ConsoleColors.message("El numero " + number + " es neutro.", ConsoleColors.YELLOW);
        } else {
            ConsoleColors.message("El numero " + number + " es negativo.", ConsoleColors.RED);
        }
        System.out.println();

        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        ConsoleColors.message("Nombre de pila: : " + Name.nickname, ConsoleColors.BLUE);
        System.out.println();

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        var random = new Random();

        ConsoleColors.message("Numero random: " + random.nextInt(1, 11), ConsoleColors.YELLOW);
        System.out.println();

        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.
        var person = new Person("kako");

        person.sayHi();
        System.out.println();

        person.talk();
        System.out.println();

        person.sleep();
        System.out.println();

        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        User.username = "kako";

        var user = new User("Joaquin");

        user.info();
        System.out.println();
        scanner.close();

        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.
        // NO TOMAR EN CUENTA
    }
}
