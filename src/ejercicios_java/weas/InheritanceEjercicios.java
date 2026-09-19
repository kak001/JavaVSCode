package weas;

import java.util.ArrayList;

public class InheritanceEjercicios {
    public static void main(String[] args) {

        // run-code

        // 1.
        // Super Class
        var vehicle = new Vehicle("Porsche", "911 GT3 RS", "Gris Mate");
        vehicle.move();

        // Sub Class
        var car = new Car("Mercedes-Benz AMG", "GT Black Series", "Naranjo");
        car.honkNoise();
        System.out.println();

        // 2.
        // Sub class
        var student = new Student("kako", 20, 7.0);
        student.study();
        System.out.println();

        // 3.
        // Super class
        var animal = new Animal("Arenita");
        animal.makeSound();

        // Sub classes
        var dog = new Dog("Tobby");
        dog.makeSound();

        var cat = new Cat("Miku");
        cat.makeSound();
        System.out.println();

        // 4.
        var employee = new Employee("kako", 2500000);
        employee.employeeInfo();

        var manager = new Manager("Joaquin", 3500000, "Ciberseguridad");
        manager.employeeInfo();
        System.out.println();

        // 5.
        var circle = new Circle(5);
        System.out.println("El area de un circulo de radio 5 es: " + circle.calculateArea() + " cm^2.");

        var rectangle = new Rectangle(3, 5);
        System.out.println("El area de un rectangulo ancho 3 y altura 5 es: " + rectangle.calculateArea() + " cm^2.");
        System.out.println();

        // 6.
        var bird = new Bird("Paloma");
        bird.fly();

        var eagle = new Eagle("Aguila calva");
        eagle.fly();
        System.out.println();

        // 7.
        var device = new Device();
        var phone = new Phone();
        // Ignorar
        System.out.println(device);
        System.out.println(phone);
        System.out.println();

        // 8.
        var account = new SavingsAccount(10000, 0.05);
        account.deposit(5000);
        account.withdraw(7000);
        account.addInterest();
        System.out.println();

        // 9.
        var anotherVehicle = new AnotherVehicle("Volkswagen", "Golf GTI", 2026);
        anotherVehicle.describe();

        var anotherCar = new AnotherCar("Porsche", "911 Carrera RS 2.7", 1972);
        anotherCar.describe();

        var bike = new Bike("Kawasaki", "Ninja ZX-6R", 2026);
        bike.describe();

        var truck = new Truck("Volvo", "FH 16 Aero 780", 2026);
        truck.describe();
        System.out.println();

        // 10.
        ArrayList<AnotherAnimal> animals = new ArrayList<>();
        animals.add(new AnotherDog("Max"));
        animals.add(new AnotherCat("Happy"));
        animals.add(new AnotherBird("Pio"));

        for (AnotherAnimal a : animals) {
            a.makeSound();
        }
    }

    // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
    // Super class
    public static class Vehicle {
        
        //Atributos
        String brand;
        String model;
        String color;

        // Constructor
        public Vehicle(String brand, String model, String color) {
            this.brand = brand;
            this.model = model;
            this.color = color;
        }

        // Metodos
        public void move() {
            System.out.println("El vehiculo se esta movimiendo.");
        }
    }

    // Sub class
    public static class Car extends Vehicle {

        // Constructor
        public Car(String brand, String model, String color) {
            super(brand, model, color);
        }

        // Metodos
        public void honkNoise() {
            System.out.println("¡HONK!");
        }
    }

    // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
    // Super class
    public static class Person {

        // Atributos
        String name;
        int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // Sub class
    public static class Student extends Person {

        // Atributos
        double grade;

        // Constructor
        public Student(String name, int age, double grade) {
            super(name, age);
            this.grade = grade;
        }

        // Metodos
        public void study() {
            System.out.println("El alumno " + name + " de " + age + " de edad esta estudiando para poder alzanzar una nota " + grade + " en programacion orientada a objetos.");
        }
    }
    
    // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
    // Super class
    public static class Animal {

        // Atributos
        private String name;

        // Constructor
        public Animal(String name) {
            this.name = name;
        }

        // Getters
        public String getName() {
            return name;
        }

        // Setters
        public void setName(String name) {
            this.name = name;
        }

        // Metodos
        public void makeSound() {
            System.out.println("El animal de nombre " + name + " esta haciendo un sonido propio generico.");
        }
    }

    // Sub classes
    public static class Dog extends Animal {

        // Constructor
        public Dog(String name) {
            super(name);
        }

        // Metodos
        @Override
        public void makeSound() {
            System.out.println("El perro " + getName() + " esta ladrando: ¡Woof!");
        }
    }

    public static class Cat extends Animal {

        // Constructor
        public Cat(String name) {
            super(name);
        }

        // Metodos
        @Override
        public void makeSound() {
            System.out.println("El gato " + getName() + " esta maullando: ¡Meow!");
        }
    }
    
    // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
    // Super class
    public static class Employee {

        private String name;
        private int salary;

        public Employee(String name, int salary){
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }
         
        public int getSalary() {
            return salary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void employeeInfo() {
            System.out.println("El trabajador " + name + " gana un salario mensual de: $" + salary + " pesos chilenos.");
        }
    }

    //Sub class
    public static class Manager extends Employee {

        private String department;

        public Manager(String name, int salary, String department) {
            super(name, salary);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        @Override
        public void employeeInfo() {
            System.out.println("El trabajador " + getName() + " trabaja en el departamento de " + getDepartment() + " ganando mensualmente: $" + getSalary() + " pesos chilenos.");
        }
    }
    
    // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
    // Abstract class

    static abstract class Shape {
        public abstract double calculateArea();
    }

    // Abstract sub classes
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
    
    // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
    // Super class
    public static class Bird {
        private String name;

        public Bird(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void fly() {
            System.out.println("El ave " + name + " esta volando.");
        }
    }

    // Sub class
    public static class Eagle extends Bird {
        public Eagle(String name) {
            super(name);
        }

        @Override
        public void fly() {
            super.fly();
            System.out.println("El aguila esta volando muy rapido y alto.");
        }
    }
    
    // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
    // Super class
    public static class Device {
        public Device() {
            System.out.println("Device created");
        }   
    }

    // Sub class
    public static class Phone extends Device {
        public Phone() {
            System.out.println("Phone ready");
        }
    }

    // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
    // Super class
    public static class Account {
        protected double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Operacion invalida, el monto a depositar debe ser positivo");
                return;
            }
            balance += amount;
            System.out.println("Deposito hecho con exito");
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Operacion invalida, el monto a retirar debe positivo");
                return;
            }
            if (amount > balance) {
                System.out.println("Fondos insuficientes");
                return;
            }
            balance -= amount;
            System.out.println("Retiro hecho con exito");
        }

        public double getBalance() {
            return balance;
        }
    }

    // Sub class
    public static class SavingsAccount extends Account {
        private double interestRate;

        public SavingsAccount(double balance, double interestRate) {
            super(balance);
            this.interestRate = interestRate;
        }

        public void addInterest() {
            double interest = balance * interestRate;
            System.out.println("Interes agregado: $" + interest + ", nuevo saldo: $" + balance);
        }
    }
    
    // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
    // Super class
    public static class AnotherVehicle {
        private String brand;
        private String model;
        private int year;

        public AnotherVehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public String getBrand() {return brand;}
        public String getModel() {return model;}
        public int getYear() {return year;}

        public void setBrand(String brand) {this.brand = brand;}
        public void setModel(String model) {this.model = model;}
        public void setYear(int year) {this.year = year;}

        public void describe() {
            System.out.println("=========================");
            System.out.println("DATOS DEL VEHICULO");
            System.out.println("Marca: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Año: " + year);
            System.out.println("=========================");
        }
    }

    // Sub class
    public static class AnotherCar extends AnotherVehicle {
        public AnotherCar(String brand, String model, int year) {
            super(brand, model, year);
        }

        @Override
        public void describe() {
            System.out.println("=========================");
            System.out.println("DATOS DEL AUTOMOVIL");
            System.out.println("Marca: " + getBrand());
            System.out.println("Model: " + getModel());
            System.out.println("Año: " + getYear());
            System.out.println("=========================");
        }
    }

    public static class Bike extends AnotherVehicle {
        public Bike(String brand, String model, int year) {
            super(brand, model, year);
        }

        @Override
        public void describe() {
            System.out.println("=========================");
            System.out.println("DATOS DE LA MOTOCICLETA");
            System.out.println("Marca: " + getBrand());
            System.out.println("Model: " + getModel());
            System.out.println("Año: " + getYear());
            System.out.println("=========================");
        }
    }

    public static class Truck extends AnotherVehicle {
        public Truck(String brand, String model, int year) {
            super(brand, model, year);
        }

        @Override
        public void describe() {
            System.out.println("=========================");
            System.out.println("DATOS DEL CAMION");
            System.out.println("Marca: " + getBrand());
            System.out.println("Model: " + getModel());
            System.out.println("Año: " + getYear());
            System.out.println("=========================");
        }
    }
    
    // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
    //Super class
    public static class AnotherAnimal {
        private String name;

        public AnotherAnimal(String name) {
            this.name = name;
        }

        public String getName() {return name;}

        public void setName(String name) {this.name = name;}

        public void makeSound() {
            System.out.println("El animal " + name + " esta haciendo un sonido propio generico");
        }
    }

    // Sub classes
    public static class AnotherDog extends AnotherAnimal {
        public AnotherDog(String name) {super(name);}

        @Override
        public void makeSound() {
            System.out.println("El perro " + getName() + " esta ladrando: ¡Woof!");
        }
    }

    public static class AnotherCat extends AnotherAnimal {
        public AnotherCat(String name) {super(name);}

        @Override
        public void makeSound() {
            System.out.println("El gato " + getName() + " esta maullando: ¡Meow!");
        }
    }

    public static class AnotherBird extends AnotherAnimal {
        public AnotherBird(String name) {super(name);}

        @Override
        public void makeSound() {
            System.out.println("El pajaro " + getName() + " esta cantando: ¡Pio pio!");
        }
    }
}