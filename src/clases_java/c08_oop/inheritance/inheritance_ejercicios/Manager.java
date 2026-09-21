package clases_java.c08_oop.inheritance.inheritance_ejercicios;

public class Manager extends Employee {
    // Atributo
    private String department;

    // Constructor
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Getter
    public String getDepartment() {
        return department;
    }

    // Setter
    public void setDepartment(String department) {
        this.department = department;
    }
}
