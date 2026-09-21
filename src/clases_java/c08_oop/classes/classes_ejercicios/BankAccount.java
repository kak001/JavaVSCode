package clases_java.c08_oop.classes.classes_ejercicios;

public class BankAccount {
    // Atributo
    private int balance;

    // Constructor
    public BankAccount(int balance) {
        this.balance = balance;
    }

    // Getter
    public int getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Metodo
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Error: Cantidad invalida para el deposito.");
        } else {
            balance += amount;
        }
    }
}
