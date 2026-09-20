package clases_java.c09_exceptions.exception_ejercicios;

public class PasswordChecker {
    // Metodos
    public void passwordChecker(String pass) throws CustomException {
        if (pass.length() < 8) {
            throw new CustomException("Contraseña no valida.");
        }
    }
}
