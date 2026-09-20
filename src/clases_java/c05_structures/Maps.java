package clases_java.c05_structures;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Declaracion y creacion
        HashMap<String, String> names = new HashMap<>(); // Forma antigua
        var numbers = new HashMap<Integer, String>(); // Forma moderna

        // Tamaño

        System.out.println(names.size());

        // Añadir elementos

        names.put("kako", "joaco.atj06@gmail.com"); // Añade elementos a una variable Map usando una llave-valor
        names.put("Joako", "joaco.tj206@gmail.com");
        names.put("Joaquin", "donhuevoxd2100@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos

        System.out.println(names.get("kako")); // Accedo al contenido segun la llave
        System.out.println(names.get("ola")); // Si no existe la llave imprime null

        // Verificar elementos
        
        System.out.println(names.containsKey("kako")); // Verifica si existe una llave 
        System.out.println(names.containsKey("ola")); // Si no existe la llave imprime false
        System.out.println(names.containsValue("joaco.atj06@gmail.com")); // Verifica si existe el contenido 

        // Eliminar elementos

        System.out.println(names.remove("kako"));
        System.out.println(names.remove("Joako"));
        System.out.println(names);

        // Limpiar HashMap

        names.clear();
        System.out.println(names);

        // Otras operaciones

        names.put("kako", "joaco.atj06@gmail.com");
        System.out.println(names);

        names.put("kako", "joaco.tj206@gmail.com");
        System.out.println(names);

        names.replace("Joako", "joaco.atj206@gmail.com"); // Reemplaza el valor solo si existe
        System.out.println(names);

        names.putIfAbsent("Joako", "joaco.atj206@gmail.com"); // Añade el valor solo si no existe
        System.out.println(names);

        System.out.println(names.isEmpty());
        System.out.println(names.values());

        var values = names.values();
        System.out.println(values);

        System.out.println(numbers);
        
    }
}
