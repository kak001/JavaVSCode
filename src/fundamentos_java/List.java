package Java.src.fundamentos_java;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        
        // Declaracion y creacion

        ArrayList<String> names = new ArrayList<>(); // Forma antigua
        var numbers = new ArrayList<Integer>(); // Forma moderna

        // Tamaño

        System.out.println(names.size()); // Muestra cuando elementos contiene la lista

        // Añadir elementos

        names.add("Joako"); // Añade elementos de forma ORDENADA
        names.add("Torrent");
        names.add("kako");
        System.out.println(names.size());

        // Acceder a los elementos

        System.out.println(names.getFirst()); // Obtiene el contenido del primer elemento en la lista
        System.out.println(names.get(1)); // Obtiene el contenido segun la posicion que se le asigne en la lista
        System.out.println(names.getLast()); // Obtiene el contenido del ultimo elemento en la lista

        // Modificar los elementos

        names.set(2, "joaco.atj06@gmail.com"); // Modifica el contenido segun la posicion del elemento
        System.out.println(names.getLast());

        // Eliminar elementos

        names.remove(2); // Elimina el contenido segun la posicion del elemento en la lista

        // System.out.println(names.get(2)); Error

        //Buscar elementos

        System.out.println(names.contains("Joako")); // Verifica si existe el contenido que se le asigne imprimiendo un elemento booleano
        System.out.println(names.contains("joaco.atj06@gmail.com"));
        
        // Limpiar ArrayList
        
        names.clear(); // Limpia la lista eliminando el contenido y asi mismo las posiciones respectivas
        System.out.println(names.size());

        System.out.println(numbers);
        
    }
}
