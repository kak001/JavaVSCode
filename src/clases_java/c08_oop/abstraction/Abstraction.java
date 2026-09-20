package clases_java.c08_oop.abstraction;
public class Abstraction {
    public static void main(String[] args) {
        
        // Abstraccion
        /* La abstracion oculta la implementacion y muestra lo esencial, en otra palabras
        en la abstraccion podemos definir comportamientos sin obligar a escribirt el datalle sobre como funciona. */

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Interface  
    }
    
    // - Clase abstracta
    // Al abstraer la super clase, la podemos heredar pero NO instanciar

    public static abstract class Animal {

        // Al abstraer este metodo, me obliga para las clases hijas definirle su actuar y funcion.
        public abstract void sound();

        public void sleep() {
            System.out.println("El animal esta durmiendo");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void sound() {
            System.out.println("¡Woof!");
        }

        @Override
        public void sleep() {
            System.out.println("El perro estas durmiendo.");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void sound() {
            System.out.println("¡Meow!");
        }

        @Override
        public void sleep() {
            System.out.println("El gato esta duermiendo.");
        }
    }

    // - Interface
    // Nos permite crear metodos o instancias sin la implementacion

    public interface Flying {
        void fly();
    }

    public static class Bird extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("¡Pio pio!");
        }

        public void fly() {
            System.out.println("El pajaro vuela.");
        }
    }

    public static class Bat extends Animal implements Flying {

        @Override
        public void sound() {
            System.out.println("Soy batman!");
        }

        public void fly() {
            System.out.println("El murcielago vuela.");
        }
    }
}
