package ejercicios_java.weas;
public class Student {

    int score;

    public Student(int score) {
        this.score = score;
    }

    public void showScore() {
        if (score >= 60 && score <= 100) {
            System.out.println("La calificacion fue aprobada");
        } else if (score <= 59 && score >= 0) {
            System.out.println("La calificacion fue reprobada");
        } else {
            System.out.println("Puntuacion no valida");
        }
    }
}
