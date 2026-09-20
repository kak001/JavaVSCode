package clases_java.c02_operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        // Operadores

        // Aritmeticos

        var a = 5;

        var b = 3;

        System.out.println(a + b); // Suma
        System.out.println(a - b); // Resta
        System.out.println(a * b); // Multiplicacion
        System.out.println(a / b); // Division
        System.out.println(a % b); // Modulo (Resto de la division)

        // Operadores de asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // a = a + 1
        System.out.println(a);

        a -= 1;
        System.out.println(a);

        a *= 2;
        System.out.println(a);
        
        a /= 2;
        System.out.println(a);

        a %= 1;
        System.out.println(a);

        // Operadores de Comparación (Relacionales)

        System.out.println(a == b);
        System.out.println(a == 0);

        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // Operadores lógicos

        // Y (AND)

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false); // false && true es false
        System.out.println(false); // false && false es false

        System.out.println(3 > 2 && 5 == 2);

        // O (OR)

        System.out.println(true);
        System.out.println(true);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2); // 3 > 2 || 5 == 2 es true || false cual imprime true (Operador or)

        // NO (NOT)

        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

        // Operadores Unarios

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.err.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
        
    }
}
