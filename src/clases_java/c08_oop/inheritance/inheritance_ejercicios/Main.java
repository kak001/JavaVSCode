package clases_java.c08_oop.inheritance.inheritance_ejercicios;

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
    }
}
