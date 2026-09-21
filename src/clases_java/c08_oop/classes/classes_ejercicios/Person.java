package clases_java.c08_oop.classes.classes_ejercicios;

public class Person {
    // Atributos
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
