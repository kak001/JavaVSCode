package Java.src.fundamentos_java;

public class Arrays {
    public static void main(String[] args) {
        
        //Declaracion y creacion

        int[] numbers = new int[3]; // Creo int tipo Array donde contiene 3 slots
        System.out.println(numbers);

        String[] names = {"Joaquin", "Torrent", "kako"}; // Creo un String tipo Array donde contiene 3 Strings
        System.out.println(names);

        // Acceso

        System.out.println(numbers[2]); // Accedo a la posicion del Array e imprimo el contenido
        System.out.println(names[0]);

        System.out.println((new String[3])[0]); // Creo y Accedo a un String tipo Array imprimiendo su contenido

        // Modificacion

        numbers[0] = 1; // Modifico el contenido dentro del Array segun su posicion
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // numbers[3] = 2; Error

        System.out.println(names[2]);
        names[2] = "joaco.atj06@gmail.com";
        System.out.println(names[2]);

        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

        // numbers[2] = null; Error

        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);
        
    }
}
