/**
 * Pokémon de tipo Fuego: 35 monedas por día.
 * Si se queda menos de 3 días, no se cobra nada (sin importar el nivel).
 */
public class PokemonFuego extends Pokemon {

    private static final double TARIFA_POR_DIA = 35;
    private static final int DIAS_MINIMOS_PARA_COBRAR = 3;

    public PokemonFuego(String nombre, int nivel, int vida) throws DatosInvalidosException {
        super(nombre, nivel, vida);
    }

    @Override
    public double calcularTarifa(int dias) {
        if (dias < DIAS_MINIMOS_PARA_COBRAR) {
            return 0;
        }
        return dias * TARIFA_POR_DIA;
    }
}
