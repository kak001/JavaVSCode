package Java.src.ejercicios_java.weas;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresEjercicios {
    public static void main(String[] args) {

        // 1.
        String[] arrayA = new String[5];

        arrayA[0] = "kako";
        arrayA[1] = "21";
        arrayA[2] = "Ing. en Informatica";
        arrayA[3] = "Puente Alto";
        arrayA[4] = "Duoc UC San Joaquin";

        System.out.println(arrayA.length);

        // 2.
        System.out.println(arrayA[1]);

        arrayA[1] = "67";

        System.out.println(arrayA[1]);

        // 3.
        var arrayList = new ArrayList<Integer>();

        // 4.
        arrayList.add(1);
        arrayList.add(21);
        arrayList.add(67);
        arrayList.add(100);
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        // 5.
        var hastSet = new HashSet<String>();

        hastSet.add("kako");
        hastSet.add("21");

        // 6.
        hastSet.add("kako");
        hastSet.add("Ing. en Informatica");

        // 7.
        hastSet.remove("21");

        // 8.
        var hastMap = new HashMap<String, Integer>();

        hastMap.put("kako", 948210395);
        hastMap.put("vixo", 973165248);
        hastMap.put("mati", 915830274);

        // 9.
        hastMap.replace("kako", 926481530);
        hastMap.remove("mati");

        // 10.
        Integer[] arrayB = {1, 2, 3, 4, 5};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arrayB));

        HashSet<Integer> set = new HashSet<>(list);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);

        System.out.println("Array original: " + Arrays.toString(arrayB));
        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
        System.out.println("HashMap: " + map);

    }
}