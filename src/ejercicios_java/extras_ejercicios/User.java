package extras_ejercicios;

public class User {
    // Atributos
    private final String APP_NAME;
    static String username;

    // Constructor
    public User(String APP_NAME) {
        this.APP_NAME = APP_NAME;
    }

    // Metodo
    public void info() {
        ConsoleColors.message("Nombre: " + APP_NAME, ConsoleColors.GREEN);
        ConsoleColors.message("Nombre de Usuario: " + username, ConsoleColors.YELLOW);
    }
}
