package ejercicios_java.weas;
public class Worker {

    String name;
    int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("El trabajador " + name + " tiene un salario de: $" + salary + " dolares al mes");
    }
}
