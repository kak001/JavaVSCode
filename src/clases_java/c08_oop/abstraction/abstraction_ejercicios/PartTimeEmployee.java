package clases_java.c08_oop.abstraction.abstraction_ejercicios;

public class PartTimeEmployee extends Employee {
    // Atributos
    private int hours;
    private final int PAY_PER_HOUR = 8000;

    // Constructor
    public PartTimeEmployee(int hours) {
        this.hours = hours;
    }

    // Metodos
    @Override
    public double calculateSalary() {
        double totalSalary = (hours * PAY_PER_HOUR);

        return totalSalary;
    }
}
