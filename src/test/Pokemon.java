public abstract class Pokemon {
    // Atributos
    private String name;
    private int level;
    private int life;

    // Constructor
    public Pokemon(String name, int level, int life) {
        // Validaciones
        if (name == null) throw new NullPointerException("El nombre no puede ser null");
        if (name.isEmpty()) throw new IllegalArgumentException("El nombre no puede estar vacio.");
        if (name.isBlank()) throw new IllegalArgumentException("El nombre no puede estar en blanco.");
        if (name.length() > 10) throw new IllegalArgumentException("El nombre no puede superar los 10 caracteres.");
        if (level <= 0) throw new IllegalArgumentException("El nivel no puede ser menor o igual a 0.");
        if (level > 100) throw new IllegalArgumentException("El nivel no puede ser mayor a 100.");
        if (life <= 0) throw new IllegalArgumentException("La vida no puede ser menor o igual a 0.");
        
        this.name = name;
        this.level = level;
        this.life = life;
    }

    // Getters
    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }

    public String getName() {
        return name;
    }

    // Metodo
    public abstract int calculateRate(int days);

    public String info() {
        return "Nombre: " + name + ", nivel: " + level + ", vida: " + life + " HP.";
    }
}
