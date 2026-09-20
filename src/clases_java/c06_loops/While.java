package clases_java.c06_loops;

public class While {
    public static void main(String[] args) {
         
        // while se usa para ejecutar una linea de codigo de forma indeterminada o hasta que se definan parametros para parar su ejecucion

        // while example

        int index = 0;
        while (index < 10) {
            System.out.println(index);
            index++;
        }
        System.out.println();

        int indexA = 0;
        boolean find = false;
        while (!find) {
            System.out.println(indexA);
            indexA++;
            if (indexA >= 10) {
                find = true;
            }
        }
        System.out.println();

        // while-do forma moderna de hacer un while


        var indexB = 0;
        var find2 = false;
        do {
            System.out.println(indexB);
            indexB++;
            if ( indexB >= 10) {
                find2 = true;
            }
        } while (!find2);
        System.out.println();

    }
}
