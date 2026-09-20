package clases_java.c08_oop.access_modifiers.access_modifiers_ejercicios;

public class Product {
    // Atributo
    private double price;

    // Constructor
    public Product(double price) {
        this.price = price;
    }

    // Getter
    public double getPrice() {
        return price;
    }

    // Setter
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            ConsoleColors.message("Error: El precio a elegir es menor o igual a 0.", ConsoleColors.RED);
        }
    }
}
