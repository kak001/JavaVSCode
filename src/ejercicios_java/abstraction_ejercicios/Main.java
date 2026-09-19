package ejercicios_java.abstraction_ejercicios;

public class Main {
    public static void main(String[] args) {
        // Ejercicios
        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        // Fixed
        var circle = new Circle(5);
        var rectangle = new Rectangle(5, 7);

        circle.calculateArea();
        System.out.println();

        rectangle.calculateArea();

        System.out.println("================================================");
        
        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        var guitar = new Guitar();
        var piano = new Piano();

        guitar.play();
        System.out.println();

        piano.play();

        System.out.println("================================================");
        
        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        Animal[] animals = {
            new Dog(),
            new Cat()
        };
    
        for (Animal animal:animals) {
            animal.sound();
        }

        System.out.println("================================================");

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        var circle2 = new Circle2();
        var square = new Square();
        var triangle = new Triangle();

        circle2.draw();
        System.out.println();

        square.draw();
        System.out.println();

        triangle.draw();

        System.out.println("================================================");
        
        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        var fullTimeWorker = new FullTimeEmployee(2500000, 0.25);
        var partTimeWorker = new PartTimeEmployee(64);

        System.out.println("Salario de trabajador full time: $" + fullTimeWorker.calculateSalary() + " CLP.");
        System.out.println();

        System.out.println("Salario de trabajador part time: $" + partTimeWorker.calculateSalary() + " CLP.");

        System.out.println("================================================");
        
        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        var car = new Car(312.9);
        var robot = new Robot(true);

        car.move();
        System.out.println();

        robot.move();

        System.out.println("================================================");

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        var tv = new Tv(true);
        var washingMachine = new WashingMachine(false);

        tv.checker();
        System.out.println();

        washingMachine.checker();

        System.out.println("================================================");

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        var duck = new Duck();
        
        duck.fly();
        System.out.println();

        duck.swim();

        System.out.println("================================================");
        
        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        var pdf = new PDFDocument();
        var word = new WordDocument();

        pdf.print();
        System.out.println();

        word.print();

        System.out.println("================================================");
        
        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        var invoice = new Invoice(27990);
        var employeePayment = new EmployeePayment(2500000);

        invoice.pay();
        System.out.println();

        employeePayment.pay();

        System.out.println("================================================");
    }
}
