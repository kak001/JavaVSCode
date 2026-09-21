public class Pez implements Volador {
    // Metodo
    public void sound() {
        System.out.println("¡Glug Glug!");
    }

    @Override
    public void fly() {
        System.out.println("El pez esta volando.");
    }

}
