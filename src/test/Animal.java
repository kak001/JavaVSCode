public abstract class Animal {
    // Atributos (Estados)
    private String name;
    private int age;
    private String condition;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.condition = "Despierto.";
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Metodos
    public abstract void info();

    public abstract void sound();

    public abstract void play();

    public void sleep() {
        if (condition.contains("Despierto.")) {
            this.condition = "Durmiendo.";
            System.out.println("El animal esta durmiendo.");
        } else {
            System.out.println("El animal ya esta durmiendo.");
        }
    }
}
