/**
 * Pokémon de tipo Agua: 30 monedas por día.
 * Si el nivel es mayor a 20, se agregan 100 monedas extra al total.
 */
public class PokemonAgua extends Pokemon {

    private static final double TARIFA_POR_DIA = 30;
    private static final double RECARGO_NIVEL_ALTO = 100;
    private static final int NIVEL_LIMITE = 20;

    public PokemonAgua(String nombre, int nivel, int vida) throws DatosInvalidosException {
        super(nombre, nivel, vida); // reutiliza las validaciones del padre
    }

    @Override
    public double calcularTarifa(int dias) {
        double total = dias * TARIFA_POR_DIA;
        if (nivel > NIVEL_LIMITE) {
            total += RECARGO_NIVEL_ALTO;
        }
        return total;
    }
}
