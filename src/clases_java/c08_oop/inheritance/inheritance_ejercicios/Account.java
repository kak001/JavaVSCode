package clases_java.c08_oop.inheritance.inheritance_ejercicios;

public class Account {
    // Atributo
    private double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Metodo
    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Dato ingresado invalido.");
            return  -1;
        } else {
            balance += amount;
            return balance;
        }
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Dato ingresado invalido.");
            return -1;
        } else if (amount > balance) {
            System.out.println("Error: Dato ingresado invalido.");
            return -1;
        } else {
            balance -= amount;
            return balance;
        }
    }
}
