package clases_java.c08_oop.abstraction.abstraction_ejercicios;

public class FullTimeEmployee extends Employee {
    // Atributos
    private int salary;
    private double bonus;

    // Constructor
    public FullTimeEmployee(int salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    // Metodos
    @Override
    public double calculateSalary() {
        double totalSalary = salary * (1 + bonus);

        return totalSalary;
    }
}
