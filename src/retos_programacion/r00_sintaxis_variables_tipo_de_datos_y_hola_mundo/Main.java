package retos_programacion.r00_sintaxis_variables_tipo_de_datos_y_hola_mundo;

public class Main {
    public static void main(String[] args) {
        /*
        * EJERCICIO:* - Crea un comentario en el código y coloca la URL del sitio web oficial del
        * lenguaje de programación que has seleccionado.
        * - Representa las diferentes sintaxis que existen de crear comentarios
        * en el lenguaje (en una línea, varias...).
        * - Crea una variable (y una constante si el lenguaje lo soporta).
        * - Crea variables representando todos los tipos de datos primitivos
        * del lenguaje (cadenas de texto, enteros, booleanos...).
        * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!
        */

        // URL de Java: https://dev.java/

        String name = "kako"; // String NO es primitivo: es una clase
        System.out.println("String (cadena de texto): " + name);

        byte smallNumber = 127;
        System.out.println("byte (entero de 8 bits): " + smallNumber);

        short mediumNumber = 32000;
        System.out.println("short (entero de 16 bits): " + mediumNumber);

        int age = 20;
        System.out.println("int (entero de 32 bits): " + age);

        long bigNumber = 9_000_000_000L; // la L final es obligatoria
        System.out.println("long (entero de 64 bits): " + bigNumber);

        float weight = 70.5f; // la f final es obligatoria
        System.out.println("float (decimal de 32 bits): " + weight);

        double height = 1.8;
        System.out.println("double (decimal de 64 bits): " + height);

        char initial = 'J';
        System.out.println("char (un carácter): " + initial);

        boolean like = true;
        System.out.println("boolean (true o false): " + like);

        final int YEAR = 2006;
        System.out.println("Constante (final): " + YEAR);

        System.out.println("¡Hola, Java!");
    }
}
