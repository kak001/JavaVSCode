package Java.src.ejercicios_java.weas;
import java.util.ArrayList;

public class ClassesEjercicios {
    public static void main(String[] args) {

        // 1. y 3.
        // Class Book
        var book = new Book("1984", "George Orwell");
        book.bookData();
        System.out.println();

        // 2.
        // Class Dog
        var dog = new Dog("Luna", 8, "Mestiza");
        dog.dogData();
        dog.dogBark();
        System.out.println();

        // 4.
        // Class Car
        var car = new AnotherCar("Ferrari", "458 Italia");
        car.showDataCar();
        System.out.println();

        // 5.
        // Class Student
        var student = new Student(67);
        student.showScore();
        System.out.println();

        // 6.
        // Class BankAccount
        var bank = new BankAccount(20000);
        bank.deposit();
        System.out.println();

        // 7.
        // Class Rectangle
        var rectangle = new Rectangle(2, 5);
        rectangle.showAreaAndPerimeter();
        System.out.println();

        // 8.
        // Class Worker
        var worker = new Worker("kako", 2500);
        worker.showSalary();
        System.out.println();

        // 9.
        // Class Persons
        var names = new ArrayList<Person>();
        names.add(new Person("kako"));
        names.add(new Person("joako"));
        names.add(new Person("Joaquin"));

        for (Person namesA: names) {
            System.out.println(namesA);
        }
        System.out.println();

        // 10.
        // Class Product
        var product = new Product("Iphone 17", 1099);
        product.showProduct();
        product.productDiscount();
    }
}
