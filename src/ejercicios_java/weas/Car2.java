package ejercicios_java.weas;
public class Car2 {
    
    // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).

    // Atributo
    private int speed;

    // Constructor
    public Car2(int speed) {
        this.speed = speed;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    // Setters
    public void accelerateCar(int amount) {
        this.speed += amount;
        if (speed > 120) {
            speed = 120;
            System.out.println("Velocidad maximo alcanzada");
        }  
    }

    public void brakeCar(int amount) {
        this.speed -= amount;
        if (speed < 0) {
            speed = 0;
            System.out.println("Velocidad minima alcanzada");
        }
    }

}
