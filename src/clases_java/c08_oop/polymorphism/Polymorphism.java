package clases_java.c08_oop.polymorphism;
public class Polymorphism {
    public static void main(String[] args) {
        
        // Polimorfismo

        /* El polimorfismo permite que distintos objetos/clases/metodos respondan de manera diferente al mismo mensaje/metodo/funcion, segun el contexto */


        // - Polimorfismo por herencia (sobreescribir)  
        
        var animal = new Animal();
        animal.sound();

        var dog = new Dog();
        dog.sound();
        System.out.println();

        // - Polimorfismo por sobrecarga (sobrecarga de metodos)

        var sumNum = new Calculator();
        System.out.println(sumNum.sum(2, 5));
        System.out.println(sumNum.sum(2.5, 7.9));

    }

    public static class Animal {
        public void sound() {
            System.out.println("Algun sonido");
        }
    }

    public static class Dog extends Animal {

        /* Esto es polimorfismo. Se sobreescribe uno de los metodos o funciones segun el contexto de la clase, en este caso, la clase Dog
        se extiende de la clase Animal cual es la super clase o clase padre, siendo ahora una sub clase o clase hija y como es un perro
        quiero su sonido sea el de un ladrido, osea un Woof */
        @Override
        public void sound() {
            System.out.println("¡Woof!");
        }
    }

    public static class Calculator {
        public int sum(int a, int b) {
            return a + b;
        }

        /* Esto es polimorfismo por sobreescritura, ya que me permite usar el mismo metodo pero dependiendo el contexto o la operacion
        que el usuario quiera va hacer elige entre una operacion u otra */

        public double sum(double a, double b) {
            return a + b;
        }
    }
}
