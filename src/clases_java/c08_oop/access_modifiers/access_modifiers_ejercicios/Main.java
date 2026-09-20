package clases_java.c08_oop.access_modifiers.access_modifiers_ejercicios;

public class Main {
    public static void main(String[] args) {
        // Ejercicios
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var person = new Person("Joako", 19);

        ConsoleColors.message("Nombre: " + person.getName(), ConsoleColors.GREEN);
        person.setName("kako");
        ConsoleColors.message("Nuevo nombre: " + person.getName(), ConsoleColors.YELLOW);
        System.out.println();

        ConsoleColors.message("Edad: " + person.getAge(), ConsoleColors.GREEN);
        person.setAge(20);
        ConsoleColors.message("Nueva edad: " + person.getAge(), ConsoleColors.YELLOW);
        System.out.println();

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var product = new Product(9990);
        
        ConsoleColors.message("Precio: $" + product.getPrice() + " CLP.", ConsoleColors.GREEN);
        product.setPrice(-2990);
        product.setPrice(6990);
        ConsoleColors.message("Nuevo precio: $" + product.getPrice() + " CLP.", ConsoleColors.YELLOW);
        System.out.println();

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var bankAccount = new BankAccount(22990);

        ConsoleColors.message("Balance inicial: $" + bankAccount.getBalance() + " CLP.", ConsoleColors.BLUE);
        bankAccount.deposit(-5990);
        bankAccount.deposit(12990);
        System.out.println();

        bankAccount.withdraw(49990);
        bankAccount.withdraw(9990);
        ConsoleColors.message("Balance final: $" + bankAccount.getBalance() + " CLP.", ConsoleColors.BLUE);
        System.out.println();

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var book = new Book("Somos Polvo De Estrellas");

        ConsoleColors.message("Nombre del libro: " + book.getTitle(), ConsoleColors.YELLOW);
        // Como no tener setter, no se le puede modificar el tituto del libro.
        System.out.println();

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperature = new Temperature(59.2);

        ConsoleColors.message("Temperatura inicial: " + temperature.getCelsius() + "°C", ConsoleColors.YELLOW);
        temperature.setCelsius(-123);
        temperature.setCelsius(150);
        temperature.setCelsius(96.2);
        ConsoleColors.message("Temperatura final: " + temperature.getCelsius(), ConsoleColors.RED);
        System.out.println();

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var user = new User("kak001", "hola12345");

        ConsoleColors.message("Contraseña inicial: " + user.getPassword(), ConsoleColors.BLUE);
        ConsoleColors.message("¿Las contraseñas son iguales?: " + user.checkPassword("hola12345"), ConsoleColors.GREEN);
        ConsoleColors.message("¿Las contraseñas son iguales?: " + user.checkPassword("hol1234"), ConsoleColors.RED);
        System.out.println();

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        var employee = new Employee(2500000);

        ConsoleColors.message("Sueldo inicial: $" + employee.getSalary() + " CLP.", ConsoleColors.BLUE);
        employee.raiseSalary(-12.5);
        employee.raiseSalary(0.125);
        ConsoleColors.message("Sueldo final: $" + employee.getSalary() + " CLP.", ConsoleColors.YELLOW);
        System.out.println();

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var rectangle = new Rectangle(5.2, 7.9);

        ConsoleColors.message("Area del rectangulo: " + rectangle.calculateArea() + " cm^2", ConsoleColors.BLUE);
        System.out.println();

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 4.0.
        var student = new Student(6.7);

        ConsoleColors.message("Nota inicial: " + student.getGrade(), ConsoleColors.BLUE);
        ConsoleColors.message("¿El alumno aprobo?: " + student.isPassed(), ConsoleColors.GREEN);
        student.setGrade(2.0);
        ConsoleColors.message("Nota final: " + student.getGrade(), ConsoleColors.BLUE);
        ConsoleColors.message("¿El alumno aprobo?: " + student.isPassed(), ConsoleColors.RED);
        System.out.println();

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        var car = new Car(60);

        ConsoleColors.message("Velocidad inicial: " + car.getSpeed() + " km/h", ConsoleColors.BLUE);
        car.accelerate(100);
        
        ConsoleColors.message("Velocidad intermedia: " + car.getSpeed() + " km/h", ConsoleColors.YELLOW);
        car.brake(150);
        ConsoleColors.message("Velocidad final: " + car.getSpeed() + " km/h", ConsoleColors.RED);
    }
}
