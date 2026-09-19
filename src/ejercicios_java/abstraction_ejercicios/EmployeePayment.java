package ejercicios_java.abstraction_ejercicios;

public class EmployeePayment implements Payable {
    // Atributos
    private int amount;

    // Constructor
    public EmployeePayment(int amount) {
        this.amount = amount;
    }

    // Metodos
    @Override
    public void pay() {
        System.out.println("DEPOSITO RECIBIDO");
        System.out.println("Se ha recibido una transaccion de EmpresaGenerica.Corp con un monto de: $" + amount + " CLP a su cuenta de credito.");
    }
}
