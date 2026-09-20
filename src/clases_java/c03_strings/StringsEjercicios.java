package clases_java.c03_strings;

public class StringsEjercicios {
    public static void main(String[] args) {
        
        // 1.
        System.out.println("Hola " + "kako"); 

        // 2.
        String name = "kako";
        System.out.println(name.length()); 
        
        // 3.
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));

        // 4.
        System.out.println(name.toUpperCase()); 
        System.out.println(name.toLowerCase()); 

        // 5.
        var thing = "Hola, esto es una prueba";
        System.out.println(thing.contains("esto"));

        // 6.
        var number = 21;
        System.out.println(String.format("Hola esto es %d", number));

        // 7.
        thing = " Hola, esto es una prueba ";
        System.out.println(thing.trim());

        // 8.
        System.out.println(thing.replace(" ", "-"));

        // 9.
        var a = "chao";
        var b = new String("chao");
        System.out.println(a.equals(b));

        // 10.
        System.out.println(a.length() == (b.length()));
    }
}
