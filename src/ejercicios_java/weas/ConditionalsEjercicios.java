package Java.src.ejercicios_java.weas;
public class ConditionalsEjercicios {
    public static void main(String[] args) {

        // 1.
        var age = 21;

        if (age >= 18) { 
            System.out.println("El usuario es mayor de edad, puede votar");
        } else {
            System.out.println("El usuario es menor de edad, no puede votar");
        }

        // 2.
        var numberA = 10;
        var numberB = 11;

        if (numberA > numberB) {
            System.out.println("El numero A es mayor que el numero B");
        } else if (numberA < numberB) {
            System.out.println("El numero B es mayor que el numero A");
        } else {
            System.out.println("Ambos numero son iguales");
        }

        // 3.
        var numberC = 21;

        if (numberC > 0) {
            System.out.println("El Numero C es positivo");
        } else if (numberC < 0) {
            System.out.println("El numero C es negativo");
        } else {
            System.out.println("El numero C es igual a 0");
        }

        // 4.
        var numberD = 67;

        if (numberD % 2 == 0) {
            System.out.println("El numero D es par");
        } else {
            System.out.println("El numero D es impar");
        }

        // 5.
        var numberE = 55;

        if (numberE >= 1 && numberE <= 100) {
            System.out.println("El numero E esta en el rango de 1 a 100");
        } else {
            System.out.println("El numero E esta fuera del rango de 1 a 100");
        }

        // 6.
        var day = 5;

        switch (day) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("El numero del dia es invalido");
                break;
        }

        // 7.
        var grade = 6.7;

        if (grade >= 4.0 && grade <= 7.0) {
            System.out.println("Aprobado");
        } else if (grade <= 4.0 && grade >= 1.0) {
            System.out.println("Reprobado");
        } else {
            System.out.println("La nota no es valida");
        }

        // 8.
        var companion = false;

        if (age >= 15 || companion == true) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada denegada");
        }

        // 9.
        var letter = 'j';

        switch (letter) {
            case 'a':
                System.out.println("Es una vocal");
                break;
            case 'e':
                System.out.println("Es una vocal");
                break;
            case 'i':
                System.out.println("Es una vocal");
                break;
            case 'o':
                System.out.println("Es una vocal");
                break;
            case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }

        // 10.
        numberA = 3;
        numberB = 4;
        numberC = 2;

        if (numberA > numberB && numberA > numberC) {
            System.out.println("El numero A es el mayor: " + numberA);
        } else if (numberB > numberA && numberB > numberC) {
            System.out.println("El numero B es el mayor: " + numberB);
        } else {
            System.out.println("El numero C es el mayor: " + numberC);
        }

    }
}
