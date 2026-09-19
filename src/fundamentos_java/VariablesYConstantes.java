package fundamentos_java;
public class VariablesYConstantes {
    public static void main(String[] args) {

        //Variables

        String name = "kako"; // Defino una variable llamada "name" cual puede contener un String (Una cadena de texto)
        System.out.println(name);

        name = "joako"; // Como es una variable, puedo cambiarle el contenido de la variable
        System.out.println(name);

        // name = 67; Error (No se puede cambiar el tipo de dato, ya esta definido)

        int age = 20; // Defino una variable llamada "age" cual puede contener numeros enteros
        System.out.println(age);

        var email = "joaco.atj06@gmail.com"; /* Usar "var" como metodo para definir una variable, dependediendo del contenido que contenga la 
        variable va a definir si es un String, int, double, etc... (En este caso como contiene una cadena de texto, es un String)*/
        System.out.println(email);

        var year = 2026;
        System.out.println(year);

        //Constantes

        final String EMAIL = "joaco.atj06@gmail.com";
        // EMAIL = "joaco.atj06@gmail.com"; Es constante
        System.out.println(EMAIL);

    }
}
