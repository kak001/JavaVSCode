package clases_java.c08_oop.inheritance.inheritance_ejercicios;

public class Student extends Person {
    // Atributo
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        super(name, age);
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
    public void study() {
        System.out.println("El estudiante " + getName() + " de " + getAge() + " años estudio para una prueba, logrando una nota " + grade);
    }
}
