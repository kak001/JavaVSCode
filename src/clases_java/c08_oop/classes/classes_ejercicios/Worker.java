package clases_java.c08_oop.classes.classes_ejercicios;

public class Worker {
    // Atributos
    private String name;
    private double salary;

    // Constructor
    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
