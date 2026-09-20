package clases_java.c08_oop.access_modifiers.access_modifiers_ejercicios;

public class Employee {
    // Atributo
    private double salary;

    // Constructor
    public Employee(double salary) {
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Metodo
    public void raiseSalary(double percent) {
        if (percent <= 0) {
            ConsoleColors.message("Error: El porcentaje debe ser mayor a 0.", ConsoleColors.RED);
        } else {
            double newSalary = salary * (1 + percent);
            setSalary(newSalary);
            double percentage = percent * 100;
            ConsoleColors.message("Se ha aumentado el sueldo del trabajador en un " + percentage + "%." , ConsoleColors.GREEN); 
        }
    }
}
