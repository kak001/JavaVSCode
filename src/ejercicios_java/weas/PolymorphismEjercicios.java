package Java.src.ejercicios_java.weas;
import java.util.ArrayList;

public class PolymorphismEjercicios {
    public static void main(String[] args) {
        
        // 1.
        var animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (Animal animalList: animals) {
            animalList.makeSound();
        }
        System.out.println();

        // 2.
        var shapes = new ArrayList<Shape>();
        shapes.add(new Circle(12));
        shapes.add(new Rectangle(5, 7));

        for (Shape shapesList: shapes) {
            System.out.println("Area de la figura: "+ shapesList.calculateArea());
        }
        System.out.println();

        // 3.
        var varA = new Printer();
        System.out.println("Mi nombre: " + varA.print("kako"));

        var varB = new Printer();
        System.out.println("Mi edad: " + varB.print(20));

        var varC = new Printer();
        System.out.println("Numero Pi (Aproximado): " + varC.print(3.14));

        var varD = new Printer();
        System.out.println("Mi inicial: " + varD.print('J'));

        var varE = new Printer();
        System.out.println("¿Me gusta programar?: " + varE.print(true));
        System.out.println();

        // 4.
        var greeter = new Greeter();
        greeter.greet();
        System.out.println(greeter.greet("kako"));
        System.out.println();

        // 5.
        var vehicle = new Vehicle();
        vehicle.start();

        var vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        for (Vehicle vehicle2: vehicles) {
            vehicle2.start();
        }
        System.out.println();

        // 6
        var notification1 = new Notification();
        var notificacion2 = new EmailNotification();
        var notificacion3 = new SMSNotification();

        sendNotification(notification1);
        sendNotification(notificacion2);
        sendNotification(notificacion3);
        System.out.println();

        // 7.
        var anotherAnimal = new AnotherAnimal();
        var anotherAnimal1 = new AnotherDog();
        var anotherAnimal2 = new AnotherCat();
        var anotherAnimal3 = new Horse();

        showAnimalType(anotherAnimal);
        showAnimalType(anotherAnimal1);
        showAnimalType(anotherAnimal2);
        showAnimalType(anotherAnimal3);
        System.out.println();

        // 8.
        var converter = new Converter();
        System.out.println(converter.convert(42));
        System.out.println(converter.convert(3.14));
        System.out.println(converter.convert("Hello World!"));
        System.out.println();

        // 9.
        var product = new ArrayList<Product>();
        product.add(new Product());
        product.add(new Book(9990));
        product.add(new Electronic(249990));

        for (Product products : product) {
            products.getPrice();
        }
        System.out.println();

        // 10.
        Character[] characterArray = {new Warrior(), new Archer(), new Mage()};

        for (Character character : characterArray) {
            character.attack();
        }
    }
    
    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
    public static class Animal {
        public void makeSound() {
            System.out.println("Este animal esta haciendo un sonido propio y generico");
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("¡Woof!");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("¡Meow!");
        }
    }

    public static class Cow extends Animal {
     
        @Override
        public void makeSound() {
            System.out.println("¡Moo!");
        }
    }
    
    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
    static abstract class Shape {
        public abstract double calculateArea();
    }

    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        private double width;
        private double height;
        
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }
    
    // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
    public static class Printer {
        public String print(String a) {
            return a;
        }

        public int print(int b) {
            return b;
        } 
        
        public double print(double c) {
            return c;
        }

        public char print(char d) {
            return d;
        }

        public boolean print(boolean e) {
            return e;
        }
    }
    
    // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
    public static class Greeter {
        public void greet() {
            System.out.println("Hello");
        }

        public String greet(String name) {
            return "Hello, " + name;
        } 
    }
    
    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
    public static class Vehicle {
        public void start() {
            System.out.println("El vehiculo esta arrancando");
        }
    }

    public static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("El automovil esta arrancando");
        }
    }

    public static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("La motocicleta esta arrancando");
        }
    }

    public static class Truck extends Vehicle {
        @Override
        public void start() {
            System.out.println("El camiendo esta arrancando");
        }
    }

    // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
    public static class Notification {
        public void send() {
            System.out.println("Se ha enviado una notificacion...");
        }
    }

    public static class EmailNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Se ha enviado un mensaje por correo...");
        }
    }

    public static class SMSNotification extends Notification {
        @Override
        public void send() {
            System.out.println("Se ha enviado un mensaje por SMS...");
        }
    }

    public static void sendNotification(Notification n) {
        n.send();
    }
    
    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
    public static class AnotherAnimal {
        public String getType() {
            return "Animal generico";
        }
    }

    public static class AnotherDog extends AnotherAnimal {
        @Override
        public String getType() {
            return "Perro";
        }
    }

    public static class AnotherCat extends AnotherAnimal {
        @Override
        public String getType() {
            return "Gato";
        }
    }

    public static class Horse extends AnotherAnimal {
        @Override
        public String getType() {
            return "Caballo";
        }
    }

    public static void showAnimalType(AnotherAnimal animal) {
        System.out.println("Tipo del animal: " + animal.getType());
    }
    
    // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
    public static class Converter {
        public String convert(int value) {
            return "Entero convertido: " + value;
        }

        public String convert(double value) {
            return String.format("Decimal convertido: %.2f", value);
        }

        public String convert(String value) {
            return "Texto convertido: " + value.toUpperCase();
        }
    }
    
    // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
    public static class Product {
        public void getPrice() {
            System.out.println("El precio del producto es...");
        }
    }

    public static class Book extends Product {
        private double price;

        public Book(double price) {
            this.price = price;
        }

        @Override
        public void getPrice() {
            double total = price * (1 - 0.25);
            System.out.println("Se ha aplicado un descuento especial por la compra de este libro!");
            System.out.println("El precio final del producto es: $" + total);
        }
    }

    public static class Electronic extends Product {
        private double price;

        public Electronic(double price) {
            this.price = price;
        }

        @Override
        public void getPrice() {
            double total = price * (1 - 0.15);
            System.out.println("Se ha aplicado un descuento especial por la compra de este producto electronico!");
            System.out.println("El precio final del producto es: $" + total);
        }
    }
    
    // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
    public static class Character {
        public void attack() {
            System.out.println("¡El personaje x esta atacando!");
        }
    }

    public static class Warrior extends Character {
        @Override
        public void attack() {
            System.out.println("¡El persona de clase guerrero esta atacando espada!");
        }
    }

    public static class Archer extends Character {
        @Override
        public void attack() {
            System.out.println("¡El personaje de clase arquero esta atacando con sus flechas!");
        }
    }

    public static class Mage extends Character {
        @Override
        public void attack() {
            System.out.println("¡El personaje de clase mago esta atacando con sus hechizos!");
        }
    }
}
