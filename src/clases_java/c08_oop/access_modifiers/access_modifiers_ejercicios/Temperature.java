package clases_java.c08_oop.access_modifiers.access_modifiers_ejercicios;

public class Temperature {
    // Atributo
    private double celsius;

    // Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter
    public double getCelsius() {
        return celsius;
    }

    // Setter
    public void setCelsius(double celsius) {
        if (celsius < -100 || celsius > 100) {
            ConsoleColors.message("Error: No se puede elegir una tempertura inferior a -100°C y sobre 100°C.", ConsoleColors.RED);
        } else {
            this.celsius = celsius;
        }
    }
}
