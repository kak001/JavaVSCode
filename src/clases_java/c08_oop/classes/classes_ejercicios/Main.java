package clases_java.c08_oop.classes.classes_ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Ejercicios
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        // 3. Añade un constructor a la clase Book que reciba title y author.
        var book = new Book("1984", "George Orwell");

        System.out.println("Titulo del libro: \"" + book.getTitle() + "\" del autor " + book.getAuthor());
        System.out.println();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog();

        dog.bark();
        System.out.println();

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var car = new Car("Ferrari", "458 Italia");

        car.showData();
        System.out.println();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student = new Student(67);

        System.out.println("¿El estudiante aprobo?: " + student.checkScore(student.getScore()));
        student.setScore(49);
        System.out.println("¿El estudiante aprobo?: " + student.checkScore(student.getScore()));
        System.out.println();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var bankAccount = new BankAccount(22990);

        System.out.println("Saldo inicial: $" + bankAccount.getBalance() + " CLP.");
        bankAccount.deposit(-2990);
        bankAccount.deposit(5990);
        System.out.println("Saldo nuevo: $" + bankAccount.getBalance() + " CLP.");
        System.out.println();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle = new Rectangle();

        rectangle.calculateArea(-2, 2);
        rectangle.calculateArea(2, -2);
        System.out.println("Area del rectangulo: " + rectangle.calculateArea(2, 2));
        rectangle.calculatePerimeter(-4, 2);
        rectangle.calculatePerimeter(4, -2);
        System.out.println("Perimetro del rectangulo: " + rectangle.calculatePerimeter(4, 2));
        System.out.println();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var worker = new Worker("kako", 2500000);

        System.out.println("Nombre del trabajador: " + worker.getName() + " | Salario: $" + worker.getSalary() + " CLP.");
        System.out.println();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        var personList = new ArrayList<Person>(Arrays.asList(
            new Person("kako", 20),
            new Person("benja", 18),
            new Person("david", 19),
            new Person("juan", 21)
        ));

        int index = 0;
        for (Person person : personList) {
            index++;
            System.out.println("Persona " + index + ": Nombre: " + person.getName() + " | Edad: " + person.getAge() + " años.");
        }
        System.out.println();

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var product = new Product(19990);

        System.out.println("Precio original: $" + product.getPrice() + " CLP.");
        System.out.println("Precio con descuento del 25%: $" + product.discount() + " CLP.");
    }
}
