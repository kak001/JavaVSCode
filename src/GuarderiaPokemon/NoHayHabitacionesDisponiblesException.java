/**
 * Se lanza al intentar ingresar un Pokémon cuando las 4 habitaciones
 * de la guardería ya están ocupadas.
 */
public class NoHayHabitacionesDisponiblesException extends Exception {
    public NoHayHabitacionesDisponiblesException(String mensaje) {
        super(mensaje);
    }
}
