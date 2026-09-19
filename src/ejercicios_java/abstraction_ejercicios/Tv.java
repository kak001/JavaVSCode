package ejercicios_java.abstraction_ejercicios;

public class Tv extends Appliance {
    // Constructor
    public Tv(boolean check) {
        super(check);
    }

    // Metodos
    @Override
    public void turnOn() {
        System.out.println("La television esta encendida mostrando un programa.");
    }

    @Override
    public void turnOff() {
        System.out.println("La television esta apagada en modo espera.");
    }

    @Override
    public void checker() {
        super.checker();
    }
}
