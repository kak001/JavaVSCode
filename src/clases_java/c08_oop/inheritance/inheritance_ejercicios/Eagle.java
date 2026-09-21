package clases_java.c08_oop.inheritance.inheritance_ejercicios;

public class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("El agila esta volando.");
        super.fly();
    }
}
