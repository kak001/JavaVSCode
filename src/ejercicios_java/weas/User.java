package ejercicios_java.weas;
public class User {
    
    // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

    // Atributos
    private String username;
    private String password;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        checkPassword(password);
    }

    // Metodos
    public void checkPassword(String inputPassword) {
        if (password.equals(inputPassword)) {
            System.out.println("Contraseña invalida, ambas son iguales");
        } else {
            this.password = inputPassword;
            System.out.println("La contraseña se ha cambiado correctamente");
        }
    }
}
