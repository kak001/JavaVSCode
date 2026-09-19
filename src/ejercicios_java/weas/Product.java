package ejercicios_java.weas;
public class Product {

    String productName;
    int price;
    double discountPrice;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public void showProduct() {
        System.out.println("Nombre del producto: " + productName + " y precio del producto: $" + price + " dolares");
    }

    public void productDiscount() {
        discountPrice = price*(1- 0.25);
        System.out.println("Se ha aplicado un descuento del 25%, nuevo precio: $" + discountPrice);
    }
}
