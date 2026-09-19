package ejercicios_java.weas;
public class BankAccount {

    int deposit;
    int balance = 0;

    public BankAccount(int deposit) {
        this.deposit = deposit;
    }

    public void deposit() {
        balance += deposit;
        System.out.println("Se han depositado: $" + deposit + " dolares a su cuenta");
        System.out.println("Saldo actual: $" + balance + " dolares");
    }
}
