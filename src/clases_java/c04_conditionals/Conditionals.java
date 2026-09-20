package clases_java.c04_conditionals;

public class Conditionals {
    public static void main(String[] args) {
        
        // Condicionales

        var age = 21;

        System.out.println(age >= 18);

        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        } else if (age == 18 ) {
            System.out.println("El usuario acaba de cumplir 18");
        } else {
            System.out.println("El usuario es menor de edad");
        }

        // Switch

        var day = 1;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
                System.out.println("No es lunes, martes o miercoles");
        }

        // Forma alternativa if-else

        String variable = (age >= 18)?"El usuario es mayor de edad":"El usuario es menor de edad"; // Forma breve de usar una condicion if-else para asignaciones simples
        System.out.println(variable);
        
    }
}
