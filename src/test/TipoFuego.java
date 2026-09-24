public class TipoFuego extends Pokemon {
    private static final int DAILY_RATE = 35;
    private static final int MINIMUM_DAYS = 3;

    // Constructor
    public TipoFuego(String name, int level, int life) {
        super(name, level, life);
    }

    // Metodo
    @Override
    public int calculateRate(int days) {
        if (days < MINIMUM_DAYS) {
            return 0;
        }
        return days * DAILY_RATE;
    }
}
