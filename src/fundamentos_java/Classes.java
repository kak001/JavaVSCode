package Java.src.fundamentos_java;
public class Classes {
    public static void main(String[] args) {
       
        var person = new Person1("kako", 20);

        // person.name = "kako";
        // person.age = 20;

        person.sayHello();

        person.name = "joako";

        System.out.println(person.name);
    }
}
