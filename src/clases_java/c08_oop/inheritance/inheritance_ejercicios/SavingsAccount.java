package clases_java.c08_oop.inheritance.inheritance_ejercicios;

public class SavingsAccount extends Account {
    // Atributo
    private double interestRate;

    // Constructor
    public SavingsAccount(double balance, double interestRate) {
        super(balance);

        if (interestRate <= 0) {
            throw new IllegalArgumentException("No se pueden ingresar datos menor o iguales a 0.");
        }
        this.interestRate = interestRate;
    }

    // Getter
    public double getInterestRate() {
        return interestRate;
    }

    // Setter
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Metodo
    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
}
