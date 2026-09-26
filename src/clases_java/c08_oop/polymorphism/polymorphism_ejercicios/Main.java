package clases_java.c08_oop.polymorphism.polymorphism_ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Ejecicios
        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        var animals = new ArrayList<Animal>(Arrays.asList(
            new Dog(),
            new Cat(),
            new Cow()
        ));

        for (Animal animal : animals) {
            animal.makeSound();
        }
        System.out.println();

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        var shapes = new ArrayList<Shape>(Arrays.asList(
            new Circle(5.5),
            new Circle(7.8),
            new Circle(12.2),
            new Rectangle(2.7, 8.9),
            new Rectangle(15.9, 21.1)
        ));

        int index = 0;
        for (Shape shape : shapes) {
            index ++;
            System.out.println("Area figura " + index + ": " + shape.calculateArea() + " cm^2");
        }
        System.out.println();

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        var printer = new Printer();

        System.out.println("Nombre: " + printer.print("kako"));
        System.out.println("Edad: " + printer.print(20));
        System.out.println("Altura: " + printer.print(1.8) + " metros");
        System.out.println("Inicial: " + printer.print('J'));
        System.out.println("¿Me gusta programar?: " + printer.print(true));
        System.out.println();

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        var greeter = new Greeter();

        greeter.greet();
        greeter.greet("kako");
        System.out.println();

        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        var vehicles = new ArrayList<Vehicle>(Arrays.asList(
           new Car(),
           new Bike(),
           new Truck() 
        ));

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
        System.out.println();

        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        var sms = new SMSNotification();
        var email = new EmailNotification();

        sendNotification(sms);
        sendNotification(email);
        System.out.println();

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        var anotherDog = new AnotherDog();
        var anotherCat = new AnotherCat();
        var horse = new Horse();

        showAnimalType(anotherDog);
        showAnimalType(anotherCat);
        showAnimalType(horse);
        System.out.println();

        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        var converter = new Converter();
        System.out.println(converter.convert(20));
        System.out.println(converter.convert(12.5));
        System.out.println(converter.convert("kako"));
        System.out.println();

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        var products = new ArrayList<Product>(Arrays.asList(
            new Book(20000),
            new Electronic(69990),
            new Electronic(149990) 
        ));

        for (Product items : products) {
            System.out.println("Precio original: $" + items.getOriginalPrice() + " CLP. | Precio con descuento: $" + items.getPrice() + " CLP.");
        }
        System.out.println();

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        Character[] characters = {new Warrior(), new Archer(), new Mage()};

        for (Character character : characters) {
            character.attack();
        }
    }

    public static void sendNotification(Notification n) {
        n.send();
    }

    public static void showAnimalType(AnotherAnimal animal) {
        System.out.println("Tipo del animal: " + animal.getType());
    }
}
