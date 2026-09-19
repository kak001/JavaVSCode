package Java.src.ejercicios_java.weas;
public class BankAccount2 {
    
    // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.

    // Atributos
    private double balance;

    // Constructor
    public BankAccount2(double balance) {
        this.balance = balance;
    }

    // Getters
    public double getBalance() {
        return balance;
    }

    // Metodos
    public void depositAmount(double amount) {
        if (amount <= 0) {
            System.out.println("Depostivo no valido, ingresa un monto mayor a 0");
        } else {
            balance += amount;
        }
    }

    public void withdrawAmount(double amount) {
        if (amount > balance) {
            System.out.println("Retiro no valido, ingresa un monto menor o igual al balance");
        } else {
            balance -= amount;
        }
    }
}
