package ejercicios_java.weas;
//Explicacion de cada linea de codigo en Java

public class HelloWorldEjercicios { //En esta linea le damos un nombre a la clase y su privacidad cual es publica 
    public static void main(String[] args) { //Aqui es basicamente donde empieza a ejecutar el codigo hacia abajo
        System.out.println("1: kako x)"); //Ejecuto un println donde escribo mi sobrenombre
        System.out.println("2.1: Hola" + "\n" + "Mundo"); //Correccion del segundo ejercicio cual al agregar \n hace un salto del lineas
        System.out.println("3: Mi color favorito es el blanco");
        System.out.println("4: A la fecha tengo 20 años (2026)"); //En estos tres printlns escribo mi color favorito, mi edad y en que ciudad vivo
        System.out.println("5: Vivo en Santiago de Chile");
        System.err.println("6: esto se supone que deberia imprimir un error?");
        System.out.println("7: Hola");
        System.out.println("8: esto");
        System.out.println("9: es"); //Una frase escrita en println distinto
        System.out.println("10: una");
        System.out.println("11: frase.");
        System.out.println(("12: :) | :O | x) | ._. | -.- | :p ")); //Texto tipo ASCII de caritas

        //Al iniciar el programa sin el metodo main se registra dos problemas, uno que se esperaba un identificador 
        //Y otro muestra que es un tipo de inicio ilegal

        /*
        Al iniciar el archivo sin el mismo nombre de la clase el programa no se ejecuta
        cual el mismo registro de errores sugiere colocar el mismo nombre de la clase al fichero 
        para poder hacerlo funcionar o correr
        */
    }
}
