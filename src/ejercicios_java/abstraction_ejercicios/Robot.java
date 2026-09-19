package ejercicios_java.abstraction_ejercicios;

public class Robot implements Movable {
    // Atributos
    private boolean battery;

    // Constructor
    public Robot(boolean battery) {
        this.battery = battery;
    }

    // Metodos
    @Override
    public void move() {
        if (battery) {
            System.out.println("El robot tiene bateria, esta moviendose.");
        } else {
            System.out.println("El robot no tiene bateria, no puede moverse.");
        }
    }
}
