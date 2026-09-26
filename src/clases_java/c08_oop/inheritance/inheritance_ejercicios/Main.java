package clases_java.c08_oop.inheritance.inheritance_ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Ejercicios
        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        var car = new Car();

        car.move();
        car.honk();
        System.out.println();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        var student = new Student("kako", 20, 6.7);

        student.study();
        System.out.println();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        var dog = new Dog();
        var cat = new Cat();

        dog.makeSound();
        cat.makeSound();
        System.out.println();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        var manager = new Manager("kako", 4500000, "Ciberseguridad");

        System.out.println("Nombre del manager: " + manager.getName() + " | Salario: $" + manager.getSalary() + " CLP. | Departamento: " + manager.getDepartment());
        System.out.println();
        
        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        var circle = new Circle(7.5);
        var rectangle = new Rectangle(5.2, 12.7);

        if (circle.calculateArea() != -1) {
            System.out.println("Area del circulo: " + circle.calculateArea() + " cm^2");
        }


        if (rectangle.calculateArea() != -1) {
            System.out.println("Area del circulo: " + rectangle.calculateArea() + " cm^2");
        }
        System.out.println();

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        var eagle = new Eagle();

        eagle.fly();
        System.out.println();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        var device = new Device();
        var phone = new Phone();
        System.out.println();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        SavingsAccount savingsAccount = null;

        try {
            savingsAccount = new SavingsAccount(2500000, 0.075);
            savingsAccount.addInterest();
        if (savingsAccount.getBalance() != -1) {
            System.out.println("Saldo de la cuenta: $" + savingsAccount.getBalance() + " CLP.");
        }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        var vehicleList = new ArrayList<AnotherVehicle>(Arrays.asList(
            new Bike(),
            new AnotherCar(),
            new Truck()
        ));
        
        for (AnotherVehicle vehicle : vehicleList) {
            vehicle.describe();
        }
        System.out.println();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        var animalList = new ArrayList<AnotherAnimal>(Arrays.asList(
            new AnotherDog(),
            new AnotherCat(),
            new AnotherBird() 
        ));

        for (AnotherAnimal animal : animalList) {
            animal.makeSound();
        }

        // IGNORAR
        System.out.println(device);
        System.out.println(phone);
    }
}
