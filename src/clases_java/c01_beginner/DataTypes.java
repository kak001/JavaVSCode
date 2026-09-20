package clases_java.c01_beginner;

public class DataTypes {
    public static void main(String[] args) {
        
        //Tipos de datos primitivos

        int myInt = 20;
        System.out.println(myInt);

        double myDouble = 1.80;
        System.out.println(myDouble);

        // float, long, byte

        char myChar = 'k';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola Java";
        System.out.println(myString);

        System.out.println(myString.getClass().getSimpleName());
        
    }
}
