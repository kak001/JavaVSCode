package clases_java.c08_oop.abstraction.abstraction_ejercicios;

public class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Para dibujar un triangulo, se necesita dibujar tres lineas, independiente de sus longitudes, se unen sus extremos cuales deben formar una figura geometrica de tres lados, tres vertices y tres angulos.");
    }
}
