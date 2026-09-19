package Java.src.ejercicios_java.abstraction_ejercicios;

public abstract class Appliance {
    // Atributos
    private boolean check;

    // Constructor
    public Appliance(boolean check) {
        this.check = check;
    }

    // Getter
    public boolean getCheck() {
        return check;
    }

    // Setter
    public void setCheck(boolean check) {
        this.check = check;
    }

    // Metodos
    public abstract void turnOn();

    public abstract void turnOff();

    public void checker() {
        if (getCheck()) {
            turnOn();
        } else {
            turnOff();
        }
    }
}
