public class Cat extends Animal {
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Metodos (Comportamientos)
    @Override
    public void info() {
        System.out.println("Nombre: " + getName() + ", edad: " + getAge() + " años y estado: " + getCondition());
    }

    @Override
    public void sound() {
        System.out.println("¡Meow!");
    }

    @Override
    public void play() {
        System.out.println("El gato " + getName() + " esta jugando con una bola de estambre.");
    }
}
