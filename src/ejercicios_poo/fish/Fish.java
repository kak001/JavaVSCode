package fish;

public abstract class Fish {
    // === Atributos ===
    private String race;
    private double weight;
    private double length;

    // === Constructor ===
    public Fish(String race, double weight, double length) {
        setRace(race);
        setWeight(weight);
        setLength(length);
    }

    // === Getters ===
    public String getRace() {
        return race;
    }
    public double getWeight() {
        return weight;
    }
    public double getLength() {
        return length;
    }

    // === Setters ===
    public void setRace(String race) {
        if (race == null) throw new NullPointerException("La raza no puede ser nula.");
        if (race.isEmpty()) throw new IllegalArgumentException("La raza no puede estar vacía.");
        if (race.isBlank()) throw new IllegalArgumentException("La raza no puede estar en blanco");
        if (race.matches(".*\\d.*")) throw new IllegalArgumentException("La raza no puede contener números");
        this.race = race;
    }
    public void setWeight(double weight) {
        if (weight <= 0) throw new IllegalArgumentException("El peso no puede ser menor o igual a cero.");
        this.weight = weight;
    }
    public void setLength(double length) {
        if (length <= 0) throw new IllegalArgumentException("La longitud no puede ser menor o igual a cero.");
        this.length = length;
    }

    // === Métodos ===
    public abstract void info();
    public abstract void sound();
}
