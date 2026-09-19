package Java.src.fundamentos_java;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {
        
        // Loops

        // - for controlado por contador

        for (int index = 0; index < 5; index++) {
            System.out.println("Hola, Java!");
        }
        System.out.println();

        /* Dentro del ciclo for definimos una variables llamada "index" para enteros con un valor igual a 0, despues se tiene que repetir hasta un cierto numero
        o condicion y finalmente como varia el contador segun cada vez que se ejecuta el codigo*/

        String[] names = {"kako", "joako", "Joaquin", "joaco.atj06@gmail.com"};

        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
        System.out.println();

        // - for-each

        for (String namesA: names) {
            System.out.println(namesA);
        }
        System.out.println();

        var numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        for (Integer numbersA: numbers) {
            System.out.println(numbersA);
        }
        System.out.println();

        var namesNumbers = new HashMap<String, Integer>();
        namesNumbers.put("kako", 957205312);
        namesNumbers.put("lili", 998838964);
        namesNumbers.put("pato", 951892079);

        for (Map.Entry<String, Integer> namesNumbersA: namesNumbers.entrySet()) {
            System.out.println(namesNumbersA.getKey());
            System.out.println(namesNumbersA.getValue());
        }
        System.out.println();

        // - while

        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Java!");
            index++;
        }
        System.out.println();

        index = 0;
        while (index < names.length) {
            System.out.println(names[index]);
            index++;
        }
        System.out.println();

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(names[index]);
            if (names[index].equals("Joaquin")) {
                find = true;
            }
            index++;
        }
        System.out.println();
        
        // - do-while

        index = 0;
        do {
            System.out.println("Hola, Java!");
            index++;
        } while (index < 0);
        System.out.println();

        // Control de bucles

        // - break

        for (String namesA: names) {
            if (namesA.equals("Joaquin")) {
                break;
            }
            System.out.println(namesA);
        }
        System.out.println();

        // - continue

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
    }
}
