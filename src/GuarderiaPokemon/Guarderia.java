/**
 * Clase principal del sistema: administra las 4 habitaciones,
 * ingresa y saca Pokémon, calcula tarifas y lleva la cuenta
 * de todo lo recaudado.
 */
public class Guarderia {

    private Habitacion[] habitaciones;
    private double totalRecaudado;

    public Guarderia(int numeroHabitaciones) {
        habitaciones = new Habitacion[numeroHabitaciones];
        for (int i = 0; i < numeroHabitaciones; i++) {
            habitaciones[i] = new Habitacion(i + 1); // habitaciones numeradas desde 1
        }
        totalRecaudado = 0;
    }

    /** Punto a: muestra el estado detallado de cada habitación. */
    public void mostrarEstado() {
        System.out.println("--- Estado de la guardería ---");
        for (Habitacion h : habitaciones) {
            if (h.isOcupada()) {
                System.out.println("Habitación " + h.getNumero() + ": Ocupada -> " + h.getPokemon());
            } else {
                System.out.println("Habitación " + h.getNumero() + ": Desocupada (vacía)");
            }
        }
        System.out.println("-------------------------------");
    }

    /** Imprime el resumen compacto tipo [ ocupada, desocupada, ... ] usado tras cada acción. */
    private void imprimirEstadoCompacto() {
        StringBuilder sb = new StringBuilder("Guardería [ ");
        for (int i = 0; i < habitaciones.length; i++) {
            sb.append(habitaciones[i].isOcupada() ? "ocupada" : "desocupada");
            if (i < habitaciones.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        System.out.println(sb.toString());
    }

    /** Punto b: ingresa un Pokémon en la primera habitación libre. */
    public void ingresar(Pokemon pokemon) throws NoHayHabitacionesDisponiblesException {
        for (Habitacion h : habitaciones) {
            if (!h.isOcupada()) {
                h.ocupar(pokemon);
                System.out.println(pokemon.getNombre() + " ha ingresado en la habitación " + h.getNumero());
                imprimirEstadoCompacto();
                return;
            }
        }
        // Si el for termina sin encontrar habitación libre, no quedan disponibles
        throw new NoHayHabitacionesDisponiblesException(
                "No hay habitaciones disponibles. " + pokemon.getNombre() + " no fue ingresado.");
    }

    /** Punto c: saca un Pokémon de una habitación y calcula la tarifa. */
    public void salir(int numeroHabitacion, int dias) throws HabitacionInexistenteException {
        Habitacion habitacion = buscarHabitacion(numeroHabitacion);

        if (habitacion == null) {
            throw new HabitacionInexistenteException("No existe la habitación " + numeroHabitacion + ".");
        }

        if (!habitacion.isOcupada()) {
            // No es un caso de excepción según el enunciado: solo se informa y no se hace nada más
            System.out.println("Error: La habitación " + numeroHabitacion + " está desocupada");
            return;
        }

        Pokemon pokemon = habitacion.getPokemon();
        double tarifa = pokemon.calcularTarifa(dias);
        if (tarifa < 0) {
            tarifa = 0; // la tarifa nunca puede ser negativa
        }

        totalRecaudado += tarifa;

        System.out.println(pokemon.getNombre() + " sale de la habitación " + numeroHabitacion
                + ". Tarifa = " + (int) tarifa + " monedas");

        habitacion.desocupar();
        imprimirEstadoCompacto();
    }

    private Habitacion buscarHabitacion(int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) {
                return h;
            }
        }
        return null;
    }

    /** Punto e: sumatoria de todas las tarifas cobradas. */
    public double getTotalRecaudado() {
        return totalRecaudado;
    }
}
