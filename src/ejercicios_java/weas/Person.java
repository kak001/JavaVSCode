package ejercicios_java.weas;
public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nombre: " + name;
    }
}
