package exception_ejercicios;

public class LoginSystem {
    // Metodos
    public void userCheck(String user, String target) throws LoginFailedException {
        if (!user.equals(target)) {
            throw new LoginFailedException("Usuario no valido.");
        }
    }

    public void passwordChecker(String pass, String target) throws LoginFailedException {
        if (!pass.equals(target)) {
            throw new LoginFailedException("Contraseña no valida.");
        }
    }
}
