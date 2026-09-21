package clases_java.c08_oop.classes.classes_ejercicios;

public class Product {
    // Atributos
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
        this.price = price;
    }

    // Metodo
    public double discount() {
        double discountedPrice = price * 0.75;
        return discountedPrice;
    }
}
