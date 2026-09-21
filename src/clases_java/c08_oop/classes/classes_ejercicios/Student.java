package clases_java.c08_oop.classes.classes_ejercicios;

public class Student {
    // Atributo
    private int score;

    // Constructor
    public Student(int score) {
        this.score = score;
    }

    // Getter
    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(int score) {
        this.score = score;
    }

    // Metodo
    public boolean checkScore(int score) {
        if (score >= 60 && score <= 100) {
            return true;
        } else {
            return false;
        }
    }
}
