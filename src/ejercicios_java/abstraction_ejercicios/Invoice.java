package Java.src.ejercicios_java.abstraction_ejercicios;

public class Invoice implements Payable {
    // Atributo
    private int amount;

    // Constructor
    public Invoice(int amount) {
        this.amount = amount;
    }

    // Metodos
    @Override
    public void pay() {
        System.out.println("FACTURA EFECTUADA");
        System.out.println("Se ha hecho un cargo de un monto de: $" + amount + " CLP a su tarjeta de debito.");
    }
}
