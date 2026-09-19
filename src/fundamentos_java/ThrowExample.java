package fundamentos_java;
public class ThrowExample {
    // Metodos
    public void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Tienes que ser mayor de 18 años.");
        }
    }

    public void checkScore(int score) throws CustomException {
        if (score < 0 || score > 100) {
            throw new CustomException("Puntacion no valida.");
        } else {
            System.out.println("Puntuacion valida: " + score);
        }
    }
}
