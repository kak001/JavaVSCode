package clases_java.c08_oop.access_modifiers.access_modifiers_ejercicios;

public class BankAccount {
    // Atributo
    private double balance;

    // Constructor
    public BankAccount(double balance) {
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

    // Metodos
    public void deposit(double amount) {
        if (amount <= 0) {
            ConsoleColors.message("Error: No se puede depositar una cantidad negativa o neutra a la cuenta.", ConsoleColors.RED);
        } else {
            balance += amount;
            ConsoleColors.message("Deposito con exito: Se han depositado $" + amount + " CLP a la cuenta.", ConsoleColors.GREEN);
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            ConsoleColors.message("Error: No se puede retirar una cantidad mayor al balance de la cuenta.", ConsoleColors.RED);
        } else if (amount <= 0) {
            ConsoleColors.message("Error: No se puede retirar con valores negativos.", ConsoleColors.RED);
        } else {
            balance -= amount;
            ConsoleColors.message("Retiro con exito: Se han retirado: $" + amount + " CLP a la cuenta", ConsoleColors.YELLOW);
        }
    }
}
