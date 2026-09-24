public class Habitacion {
    // Atributos
    private int number;
    private boolean occupied;
    private Pokemon pokemon;

    // Constructor
    public Habitacion(int number) {
        this.number = number;
        this.occupied = false;
        this.pokemon = null;
    }

    // Getters
    public int getNumber() {
        return number;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public boolean getOccupied() {
        return occupied;
    }

    // Metodos
    public void occupy(Pokemon pokemon) {
        this.occupied = true;
        this.pokemon = pokemon;
    }

    public void vacate() {
        this.occupied = false;
        this.pokemon = null;
    }
}
