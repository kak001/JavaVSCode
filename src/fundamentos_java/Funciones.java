package fundamentos_java;
import java.util.ArrayList;
import java.util.Arrays;

public class Funciones {
    public static void main(String[] args) {
        
        // Funciones

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }
        sendEmail();
        System.out.println();

        sendEmailToUser("joaco.atj06@gmail.com");
        System.out.println();

        sendEmailToUser("joaco.atj06@gmail.com", "kako");
        System.out.println();

        var names = new ArrayList<String>(Arrays.asList("kako", "joako", "Joaquin"));
        sendEmailToUser(names);
        System.out.println();

        var state = sendEmailWithState("");
        System.out.println(state);
        System.out.println();

        System.out.println(sendEmailWithState(""));
        System.out.println();

    }

    // Funcion sin parametros ni retorno

    public static void sendEmail() {
        System.out.println("Se envio el email");
    }

    // Funcion con parametros

    public static void sendEmailToUser(String email) {
        System.out.println("Se envio el email a: " + email);
    }

    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envio el email a: " + name + " (" + email + ")");
    }

    /* Concepto de sobrecarga: Puedo reutilizar una funcion en base al mismo nombre pero puedo hacer cambios en base
    a lo que necesite, haciendo que cumpla una tarea distinta*/

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String emailsA: emails) {
            sendEmailToUser(emailsA); // Puedo reutilizar la funcion 
        }
    }

    // Funciones con retorno

    // No se puede hacer sobrecarga de funciones variando el tipo de dato

    public static boolean sendEmailWithState(String email) {
        if (email.isEmpty()) {
            return false;
        }

        System.out.println("Se envia el email a: " + email);
        return true;
    }
    
}