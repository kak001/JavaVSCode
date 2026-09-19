package Java.src.ejercicios_java.weas;
public class AccessModifiersEjercicios {

    public static void main(String[] args) {
        
        // 1.
        var person2 = new Person2("kako", 20);

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println();

        // Mod a la variable
        person2.setName("joako");
        person2.setAge(21);

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println();

        // 2.
        var product = new Product2(9990);

        System.out.println(product.getPrice());
        System.out.println();

        // Mod a la variable
        product.setPrice(-9990);
        product.setPrice(19990);
        System.out.println(product.getPrice());
        System.out.println();

        // 3.
        var moneyBank = new BankAccount2(20000);

        System.out.println(moneyBank.getBalance());
        System.out.println();

        // Mod a la variable
        moneyBank.depositAmount(-2000);
        moneyBank.depositAmount(5000);
        System.out.println(moneyBank.getBalance());
        System.out.println();

        moneyBank.withdrawAmount(30000);
        moneyBank.withdrawAmount(7000);
        System.out.println(moneyBank.getBalance());
        System.out.println();

        // 4.
        var bookTitle = new Book2("Somos polvos de estrellas");

        System.out.println(bookTitle.getTitle());
        System.out.println();

        // System.out.println(bookTitle.setTitle());
        // No esta definido el Setter

        // 5.
        var temperature = new Temperature(11.5);

        System.out.println(temperature.getCelsius());
        System.out.println();

        temperature.setCelsius(200.9);
        temperature.setCelsius(-273.9);
        temperature.setCelsius(18.2);
        System.out.println();

        System.out.println(temperature.getCelsius());
        System.out.println();

        // 6.
        var user = new User("kako", "hola12345");

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println();

        user.setUsername("joako");
        user.setPassword("hola12345");
        System.out.println();

        user.setPassword("kakokako26");
        System.out.println();

        // 7.
        var percent = new Employee(500000);

        System.out.println(percent.getSalary());
        System.out.println();

        percent.raiseSalary(0);
        percent.raiseSalary(-0.25);
        percent.raiseSalary(0.25);
        System.out.println(percent.getSalary());
        System.out.println();

        // 8.
        var rectangle2 = new Rectangle2(2, 3);

        System.out.println(rectangle2.calculateArea());
        System.out.println();

        rectangle2.setHeight(5);
        rectangle2.setWidth(7);
        System.out.println(rectangle2.calculateArea());
        System.out.println();

        // 9.
        var student2 = new Student2(67);

        student2.isPased();
        System.out.println();

        student2.setGrade(40);
        student2.isPased();
        System.out.println();

        // 10.
        var car2 = new Car2(70);

        System.out.println(car2.getSpeed());
        System.out.println();

        car2.accelerateCar(30);
        System.out.println(car2.getSpeed());

        car2.accelerateCar(100);
        System.out.println();

        car2.brakeCar(80);
        System.out.println();

        car2.brakeCar(100);
        System.out.println();

        System.out.println(car2.getSpeed());
    }
}
