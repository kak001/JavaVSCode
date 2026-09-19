package Java.src.fundamentos_java;
public class Inheritance {
    public static void main(String[] args) {
        
    // La herencia permite REUTILIZAR atributos y metodos
    // Herencia

    // run-code
    // Animal
    var animal = new Animal("Gato");
    animal.doSound();

    // Dog
    var dog = new Dog("Snowy", 3);
    dog.doSound();
    }

    // Super clase (Clase padre)
    public static class Animal {

        // Atributos
        String name;

        // Constructor
        public Animal(String name) {
            this.name = name;
        }

        // Metodos
        public void doSound() {
            System.out.println("El animal " + name + " esta haciendo un sonido propio y generico");
        }
    }

    // Sub clases (Clases hijas)
    public static class Dog extends Animal {

        // Atributo
        int age;

        // Constructor
        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        // Metodos
        @Override
        public void doSound() {
            System.out.println("El perro " + name + " de edad " + age + " esta ladrando");
        }
    }
}
