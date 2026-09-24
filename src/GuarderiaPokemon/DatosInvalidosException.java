/**
 * Se lanza cuando los datos de un Pokémon no cumplen las reglas del negocio:
 * nombre de más de 10 letras, nivel fuera de 0-100, o vida menor o igual a 0.
 */
public class DatosInvalidosException extends Exception {
    public DatosInvalidosException(String mensaje) {
        super(mensaje);
    }
}
