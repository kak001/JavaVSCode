package ejercicios_java.weas;
public class Employee {
    
    // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

    // Atributos
    private double salary;

    // Constructor
    public Employee(double salary) {
        this.salary = salary;
    }

    // Getters
    public double getSalary() {
        return salary;
    }

    // Setters
    public void raiseSalary(double percent) {
        if (percent <= 0) {
            System.out.println("Porcentaje no valido, debe ser un numero positivo");
        } else {
            salary *= (1 + percent);
        }
    }
}
