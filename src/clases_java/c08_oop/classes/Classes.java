package clases_java.c08_oop.classes;

public class Classes {
    public static void main(String[] args) {
       
        var person = new Person("kako", 20);

        // person.name = "kako";
        // person.age = 20;

        person.sayHello();

        person.name = "joako";

        System.out.println(person.name);
    }
}
