/**
 * Programa principal: reproduce exactamente la secuencia de llamadas
 * del punto 5 del enunciado (Resultado esperado).
 */
public class Main {

    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia(4);

        crearEIngresar(guarderia, "planta", "Bulbasaur", 23, 75, true);
        crearEIngresar(guarderia, "fuego", "Charmander", 27, 92, false);
        crearEIngresar(guarderia, "fuego", "Magmar", 14, 52, false);
        crearEIngresar(guarderia, "planta", "Tangela", 15, 58, false);
        crearEIngresar(guarderia, "planta", "Paras", 12, 72, true); // no quedan habitaciones

        realizarSalida(guarderia, 1, 5);
        realizarSalida(guarderia, 101, 3); // habitación inexistente

        crearEIngresar(guarderia, "fuego", "Ponyta", 256, 105, false); // nivel inválido

        realizarSalida(guarderia, 3, 2);
        realizarSalida(guarderia, 3, 2); // ya estaba desocupada

        System.out.println("Total recaudado = " + (int) guarderia.getTotalRecaudado() + " monedas");
    }

    /**
     * Crea el Pokémon del tipo indicado y lo ingresa a la guardería.
     * Aquí se atrapan las dos excepciones posibles al ingresar:
     * datos inválidos del Pokémon, o falta de habitaciones libres.
     */
    private static void crearEIngresar(Guarderia guarderia, String tipo, String nombre,
                                        int nivel, int vida, boolean semilla) {
        try {
            Pokemon pokemon;
            switch (tipo) {
                case "agua":
                    pokemon = new PokemonAgua(nombre, nivel, vida);
                    break;
                case "fuego":
                    pokemon = new PokemonFuego(nombre, nivel, vida);
                    break;
                case "planta":
                    pokemon = new PokemonPlanta(nombre, nivel, vida, semilla);
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de Pokémon desconocido: " + tipo);
            }
            guarderia.ingresar(pokemon);
        } catch (DatosInvalidosException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NoHayHabitacionesDisponiblesException e) {
            System.out.println(e.getMessage());
        }
    }

    /** Saca un Pokémon de una habitación, atrapando el caso de habitación inexistente. */
    private static void realizarSalida(Guarderia guarderia, int numeroHabitacion, int dias) {
        try {
            guarderia.salir(numeroHabitacion, dias);
        } catch (HabitacionInexistenteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
