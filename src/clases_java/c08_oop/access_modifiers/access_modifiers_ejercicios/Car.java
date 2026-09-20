package clases_java.c08_oop.access_modifiers.access_modifiers_ejercicios;

public class Car {
    // Atributo
    private int speed;

    // Constructor
    public Car(int speed) {
        this.speed = speed;
    }

    // Getter
    public int getSpeed() {
        return speed;
    }

    // Setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Metodos
    public void accelerate(int amount) {
        if (amount <= 0) {
            ConsoleColors.message("Error: La cantidad a acelerar debe ser mayor a 0.", ConsoleColors.RED);
            return;
        }
        
        speed += amount;
        if (speed > 120) {
            speed = 120;
            ConsoleColors.message("Error: La velocidad maxima es 120 km/h.", ConsoleColors.RED);
        }
    }

    public void brake(int amount) {
        if (amount <= 0) {
            ConsoleColors.message("Error: La cantidad a frenar debe ser mayor a 0.", ConsoleColors.RED);
            return;
        }
        
        speed -= amount;
        if (speed < 0) {
            speed = 0;
            ConsoleColors.message("Error: El auto se encuentra en reposo.", ConsoleColors.RED);
        }
    }
}
