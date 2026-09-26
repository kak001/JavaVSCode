package clases_java.c08_oop.polymorphism.polymorphism_ejercicios;

public class Electronic extends Product {
    // Atributo
    private double price;

    // Constructor
    public Electronic(double price) {
        this.price = price;
    }

    // Getter
    public double getOriginalPrice() {
        return price;
    }

    // Metodo
    @Override
    public double getPrice() {
        if (price > 100000) {
            return price * 0.75;
        } else if (price >= 50000 && price <= 99999) {
            return price * 0.85;
        } else {
            return price;
        }
    }
}
