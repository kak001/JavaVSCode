public class TipoAgua extends Pokemon {
    // Atributos
    private static final int DAILY_RATE = 30;
    private static final int HIGH_LEVEL_SURCHARGE = 100;
    private static final int LIMIT_LEVEL = 20;

    // Constructor
    public TipoAgua(String name, int level, int life) {
        super(name, level, life);
    }

    // Metodo
    @Override
    public int calculateRate(int days) {
        int total = days * DAILY_RATE;
        if (getLevel() > LIMIT_LEVEL) {
            total += HIGH_LEVEL_SURCHARGE;
        }
        return total;
    }
}
