package clases_java.c08_oop.composition;
public class Composition {
    public static void main(String[] args) {
        
        // Composicion ("tiene un")
        // En composicion podemos instanciar una clase dentro de otra clase utilizando sus metodos sin la necesidad de heredarla

        var car = new Car();
        car.on();
        car.off();
    }

    public static class Engine {
        public void on() {
            System.out.println("Motor encendido.");
        }

        public void off() {
            System.out.println("Motor apagado.");
        }
    }

    public static class Car {

        private static final Engine ENGINE = new Engine();

        public void on() {
            ENGINE.on();
        }

        public void off() {
            ENGINE.off();
        }
    }
}
