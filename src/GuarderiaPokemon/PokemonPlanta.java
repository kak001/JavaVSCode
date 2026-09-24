/**
 * Pokémon de tipo Planta: 25 monedas por día.
 * Tiene un atributo extra (tieneSemilla) que no existe en los otros tipos.
 * Si tiene semilla, se descuentan 45 monedas del total (nunca queda negativo).
 */
public class PokemonPlanta extends Pokemon {

    private static final double TARIFA_POR_DIA = 25;
    private static final double DESCUENTO_SEMILLA = 45;

    private boolean tieneSemilla;

    public PokemonPlanta(String nombre, int nivel, int vida, boolean tieneSemilla) throws DatosInvalidosException {
        super(nombre, nivel, vida);
        this.tieneSemilla = tieneSemilla;
    }

    public boolean isTieneSemilla() {
        return tieneSemilla;
    }

    @Override
    public double calcularTarifa(int dias) {
        double total = dias * TARIFA_POR_DIA;
        if (tieneSemilla) {
            total -= DESCUENTO_SEMILLA;
        }
        return Math.max(total, 0); // el total nunca puede ser negativo
    }
}
