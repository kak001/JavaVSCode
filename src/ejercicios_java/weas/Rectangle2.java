package ejercicios_java.weas;
public class Rectangle2 {
    
    // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

    // Atributos
    private int width;
    private int height;

    // Constructor
    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Getters 
    public int calculateArea() {
        return width * height;
    }

    // Setters
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
