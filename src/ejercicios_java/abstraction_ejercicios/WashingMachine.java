package abstraction_ejercicios;

public class WashingMachine extends Appliance {
    // Constructor
    public WashingMachine(boolean check) {
        super(check);
    }

    // Metodos
    @Override
    public void turnOn() {
        System.out.println("La lavadora esta encendida, esta lavando y la ropa sucia.");
    }

    @Override
    public void turnOff() {
        System.out.println("La lavadora esta apagada, termino de centrifugar y se apago.");
    }

    @Override
    public void checker() {
        super.checker();
    }
}
