package clases_java.c08_oop.access_modifiers.access_modifiers_ejercicios;

public class Student {
    // Atributo
    private double grade;

    // Constructor
    public Student(double grade) {
        this.grade = grade;
    }

    // Getter
    public double getGrade() {
        return grade;
    }

    // Setter
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Metodo
    public boolean isPassed() {
        if (grade >= 4.0 && grade <= 7.0) {
            return true;
        } else {
            return false;
        }
    }
}
