package weas;

public class Temperature {
    
    // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

    // Atributos
    private double celsius;

    // Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getters
    public double getCelsius() {
        return celsius;
    }

    // Setters
    public void setCelsius(double celsius) {
        if (celsius > 100 || celsius < -100) {
            System.out.println("Temperatura no valida, fuera del rango");
        } else {
            this.celsius = celsius;
        }
    }
}
