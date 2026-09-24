/**
 * Se lanza cuando se pide sacar un Pokémon de un número de habitación
 * que no existe en la guardería (por ejemplo, la habitación 101).
 */
public class HabitacionInexistenteException extends Exception {
    public HabitacionInexistenteException(String mensaje) {
        super(mensaje);
    }
}
