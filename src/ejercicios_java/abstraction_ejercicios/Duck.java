package ejercicios_java.abstraction_ejercicios;

public class Duck implements Flyable, Swimmable {
    // Metodos
    @Override
    public void fly() {
        System.out.println("¡El pato esta volando a gran altura!");
    }

    @Override
    public void swim() {
        System.out.println("¡El pato se esta nadando en el estanque!");
    }
}
