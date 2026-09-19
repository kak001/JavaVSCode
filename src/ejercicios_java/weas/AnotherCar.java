package weas;

public class AnotherCar {
    private String brand;
    private String model;

    public AnotherCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void showDataCar() {
        System.out.println("Informacion del Automovil");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
    }
}
