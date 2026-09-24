/**
 * Representa una habitación de la guardería.
 * Solo sabe tres cosas: su número, si está ocupada, y qué Pokémon
 * tiene asignado (null si está desocupada). No sabe nada de tarifas
 * ni de las otras habitaciones: esa lógica es responsabilidad de Guarderia.
 */
public class Habitacion {

    private int numero;
    private boolean ocupada;
    private Pokemon pokemon;

    public Habitacion(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.pokemon = null; // por defecto, desocupada
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void ocupar(Pokemon pokemon) {
        this.ocupada = true;
        this.pokemon = pokemon;
    }

    public void desocupar() {
        this.ocupada = false;
        this.pokemon = null;
    }
}
