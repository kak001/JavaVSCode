package clases_java.c08_oop.classes;
public class Person {

    // Atributos
    // Se definen las caracteristicas de la clase, en este caso como es una persona, su nombre y edad
    String name;
    int age;

    // Constructor
    // Basicamente esta linea de comando le pide al usuario SI O SI a ingresar los datos a ejecutar
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Metodos
    // Es "Lo que puede hacer" la clase persona, en este caso saludar
    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años");
    }
}
