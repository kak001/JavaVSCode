package ejercicios_java.weas;
public class Dog {

    String name;
    int age;
    String race;

    public Dog(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public void dogData() {
        System.err.println("Nombre: " + name + ", edad: " + age + ", raza: " + race);
    }

    public void dogBark () {
        System.out.println("Woof!");
    }
}
