public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        // Instanciar clase (Crear objeto)
        var cat = new Cat("Happy", 2);

        cat.info();
        cat.sound();
        cat.play();
        cat.sleep();
        cat.sleep();
    }
}
