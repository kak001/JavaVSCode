package Java.src.ejercicios_java.weas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsEjercicios {
    public static void main(String[] args) {
        
        // 1.
        int index = 1;
        while (index <= 10) {
            System.out.println(index);
            index++;
        }
        System.out.println();

        // 2.
        var names = new ArrayList<String>();
        names.add("kako");
        names.add("lili");
        names.add("pato");
 
        index = 0;
        do {
            System.out.println(names.get(index));
            index++;
        } while (index < names.size());
        System.out.println();

        // 3.
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) { // Si i/5 da como resto 0, es multiplo de 5
                System.out.println(i);
            }
        }
        System.out.println();

        // 4.
        int[] numbers = {1, 20, 67, 100, 20000};
        int plusTotal = 0;

        for (index = 0; index < numbers.length; index++) {
            plusTotal += numbers[index];
        }
        System.out.println(plusTotal);
        System.out.println();

        // 5.
        String[] surnames = {"Torrent", "Vargas", "Llera", "Villavicencio"};
        
        for (index = 0; index < surnames.length; index++) {
            System.out.println(surnames[index]);
        }
        System.out.println();

        // 6.
        var namesA = new HashSet<String>();
        namesA.add("kako");
        namesA.add("joako");
        namesA.add("Joaquin");

        for (String namesB: namesA) {
            System.out.println(namesB);
        }
        System.out.println();

        var nameNumber = new HashMap<String, Integer>();
        nameNumber.put("kako", 20);
        nameNumber.put("lili", 51);
        nameNumber.put("pato", 50);

        for (Map.Entry<String, Integer> nameNumberA: nameNumber.entrySet()) {
            System.out.println(nameNumberA.getKey());
            System.out.println(nameNumberA.getValue());
        }
        System.out.println();

        // 7.
        for (index = 10; index > 0; index--) {
            System.out.println(index);
        }
        System.out.println();

        // 8.
        for (index = 1; index <= 20; index++) {
            if (index % 3 == 0) {
                continue;
            }
            System.out.println(index);
        }
        System.out.println();

        // 9.
        int[] numbersB = {1, -2, 67, 100, 20};

        for (index = 0; index < numbersB.length; index++) {
            if (numbersB[index] < 0) {
                break;
            }
            System.out.println(numbersB[index]);
        }
        System.out.println();

        // 10.
        int factorial = 1;
        for (index = 1; index <= 6; index++) {
            factorial *= index;
        }
        System.out.println(factorial);
        System.out.println();
        
    }
}
