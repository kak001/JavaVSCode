public class TipoPlanta extends Pokemon {
    // Atributo
    private boolean haveSeed;
    private static final int DAILY_RATE = 25;
    private static final int DISCOUNT_BY_SEED = 45;

    // Constructor
    public TipoPlanta(String name, int level, int life, boolean haveSeed) {
        super(name, level, life);
        this.haveSeed = haveSeed;
    }

    // Metodo
    @Override
    public int calculateRate(int days) {
        int total = days * DAILY_RATE;
        if (haveSeed) {
            total -= DISCOUNT_BY_SEED;
        }
        return Math.max(total, 0);
    }
}
