package weas;

public class Product2 {
    
    // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.


    // Atributos
    private double price;

    // Constructor
    public Product2(double price) {
        this.price = price;
    }

    // Getters
    public double getPrice() {
        return price;
    }

    // Setters
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Precio elegido no valido, debe ser mayor a 0");
        } else {
            this.price = price;
        }
    }
}
