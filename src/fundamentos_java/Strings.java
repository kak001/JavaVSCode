package fundamentos_java;
public class Strings {
    public static void main(String[] args) {
        
        //Declaracion

        String name = "Kako";
        var surname = new String("Torrent"); // El "Problema" de como se define la variable es que es rebundante

        // Operaciones basicas

        // Concatenacion
        System.out.println(name + " " + surname);
        
        // Longitud 
        System.out.println(name.length()); // Lee el numero de caracteres que tiene el String

        // Obtener caracter
        System.out.println(name.charAt(0 ));  // Obtiene un caracter del String segun la posicion indexada
        System.out.println(name.charAt(name.length() - 1)); // Obtiene el ultimo caracter del String 

        // Subcadena
        System.out.println(name.substring(2)); // Define cuando empezar a typear el String segun la posicion del caracter
        System.out.println(name.substring(1, 3)); /* Define desde y hasta cuando empezar a typear el String 
        segun las posiciones inicial y finales del caracter */

        // Mayusculas y minusculas
        System.out.println(name.toUpperCase()); // Imprime el String todo en mayusculas
        System.out.println(name.toLowerCase()); // Imprime el String todo en minusculas

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("ava")); // Comprueba si contiene el o los caracteres dentro del String 
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparacion
        System.out.println(name.equals("Kako")); // Compara si el String contiene exactamente el mismo contenido que se compara
        System.out.println(name.equals("kako"));
        System.out.println(name.equalsIgnoreCase("kako")); // Compara si el String contiene el mismo contenido que se compara

        // == vs. equals
        var a = "kako";
        var b = "kako";
        var c = new String("kako");

        System.out.println(a == b); // Imprime true
        System.out.println(a == c); // Imprime false
        System.out.println(a.equals(c)); // Compara directamente el contenido de las variables y no en si las variables

        // Trim
        System.out.println(" Hola, me llame kako ".trim()); // Elimina los espacios en blanco antes y despues del contenido del texto

        // Replace
        System.out.println(" Hola, me llame kako ".replace(" ", "")); // Remplaza una parte del contenido por otro nuevo asignado
        System.out.println(" Hola, me llame kako ".replace("kako", "joako")); 

        // Format
        var age = 21;
        System.out.println(String.format("Hola me llamo %s, tengo %d años.", name, age)); /* Formatea el String usando una serie de claves y variables
        permitiendole formatearlo */

    }
}
