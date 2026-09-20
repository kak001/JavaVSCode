package clases_java.c05_structures;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        
        // Declaracion y creacion

        HashSet<String> names = new HashSet<>(); // Forma antigua
        var numbers = new HashSet<Integer>(); // Forma moderna 

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.add("Joako"); // Añado elementos al HashSet pero el sistema por como funciona y como esta pensado su proposito NO los ordena
        names.add("Torrent");
        names.add("kako");
        names.add("joaco.atj06@gmail.com");
        System.out.println(names.size());

        numbers.add(1);
        numbers.add(10);
        numbers.add(100);


        // Eliminar elementos

        names.remove("Joako"); // Como no tiene orden por que a la hora de añadir otro elemento va a cambiar el orden, se elimina segun el contenido
        System.out.println(names.size());

        // Buscar elementos

        System.out.println(names.contains("Joako"));
        System.out.println(names.contains("joaco.atj06@gmail.com"));

        System.out.println(names); // Como sistema HashSet este añade elementos unicos, osea que no pueden repetirse
        names.add("kako");
        names.add("kako");
        names.add("kako");
        System.out.println(names);

        // Conjuntos
        
        // names.addAll(numbers); Error

        var countries = new HashSet<String>(); // Creo un nuevo HashSet
        countries.add("Chile");
        countries.add("España");
        countries.add("Japon");
        countries.add("Joako");

        names.addAll(countries); // Solo puedo añadir este HashSet a otro HashSet siempre cuando sean del mismo tipo de variable
        System.out.println(names);

        // names.removeAll(countries);
        
        System.out.println(names);

        names.retainAll(countries); // Hace un place-in del Set que se esta ejecutando dejando solamente los datos unicos REPETIDOS
        System.out.println(names);
        
        
    }
}
