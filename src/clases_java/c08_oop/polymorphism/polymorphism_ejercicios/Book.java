package clases_java.c08_oop.polymorphism.polymorphism_ejercicios;

public class Book extends Product {
    // Atributo
    private double price;

    // Constructor
    public Book(double price) {
        this.price = price;
    }

    // Getter
    public double getOriginalPrice() {
        return price;
    }

    // Metodo
    @Override
    public double getPrice() {
        if (price > 12000) {
            return price * 0.85;
        } else {
            return price;
        }
    }
}
