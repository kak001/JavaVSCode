package clases_java.c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ForAndForEach {
    public static void main(String[] args) {

        // for se usa para recorrer una lista o numeros una vez, ejecutando el codigo que tenga dentro

        // for para un Array
        //Recorre el Array imprimiendo el contenido y demas se puede imprimir la posicion

        String[] names = {"kako", "joako", "Joaquin"};

        for (int index = 0; index < names.length; index++) {
            System.out.println("Posicion: " + index + " | " + "Nombre: " + names[index]);
        }
        System.out.println();

        // for-each para un Array
        //Recorre el Array, imprimiendo solo el contenido.

        for (String namesA: names) {
            System.out.println(namesA);
        }
        System.out.println();

        // for para un ArrayList

        var namesB = new ArrayList<String>();
        namesB.add("kako");
        namesB.add("joako");
        namesB.add("Joaquin");

        for (int indexA = 0; indexA < namesB.size(); indexA++) {
            System.out.println("Posicion: " + indexA + " | " + "Nombre: " + namesB.get(indexA));
        }
        System.out.println();

        // for-each para un ArrayList

        for (String namesC: namesB) {
            System.out.println(namesC);
        }
        System.out.println();

        // for-each para un HashSet (Estructura de Datos No Ordenada)

        var namesD = new HashSet<String>();
        namesD.add("kako (En teoria pos: 0)");
        namesD.add("joako (En teoria pos: 1)");
        namesD.add("Joaquin (En teoria pos: 2)");

        for (String namesE: namesD) {
            System.out.println(namesE);
        }
        System.out.println();

        // for-each para un HashMap (Estructura de Datos No Ordenada)
        
        var namesF = new HashMap<String, Integer>();
        namesF.put("kako", 20);
        namesF.put("lili", 51);
        namesF.put("pato", 50);

        for (Map.Entry<String, Integer> namesG: namesF.entrySet()) {
            System.out.println(namesG.getKey()); // Imprime las llaves
            System.out.println(namesG.getValue());// Imprime los valores
        }
        System.out.println();

        // for-each de un HashMap SOLO para las claves

        for (String namesKey: namesF.keySet()) {
            System.out.println(namesKey);
        }
        System.out.println();

        // for-each de un HashMap SOLO para los valores

        for (Integer namesValue: namesF.values()) {
            System.out.println(namesValue);
        }
        System.out.println();

    }
}
