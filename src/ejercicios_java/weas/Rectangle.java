package ejercicios_java.weas;
public class Rectangle {

    int sideA;
    int sideB;
    int areaRectangle;
    int perimeterRectangle;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void showAreaAndPerimeter() {
        areaRectangle = sideA * sideB;
        perimeterRectangle = sideA*2 + sideB*2;
        System.out.println("El area del rectangulo es: " + areaRectangle + " cm");
        System.out.println("El perimetro del rectangulo es: " + perimeterRectangle + " cm");
    }
}
