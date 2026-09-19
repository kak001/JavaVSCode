package weas;

public class ArithmeticOperatorsEjercicios {
    public static void main(String[] args) {

        // 1.
        var a = 5;

        System.out.println(a + 1);
        System.out.println(a - 1);
        System.out.println(a * 2);
        System.out.println(a / 5);

        // 2.
        a = 8;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        a %= 5;
        System.out.println(a);

        // 3.
        a = 5;
        System.out.println(a == 5);
        System.out.println(a < 10);
        System.out.println(a >= 2);

        // 4.
        System.out.println(a == 10);
        System.out.println(a < 2);
        System.out.println(a >= 6);

        // 5.
        System.out.println(true && false); // Es false

        // 6.
        System.out.println(false || true); // Es true

        // 7.
        System.out.println(false || true); // (false && true) es false y (fasle || true) es true

        // 8.
        System.err.println(!(a == 5));

        // 9.
        a = 5;
        System.err.println(-a); // Es -5
        System.out.println(a++); // Es 6 pero primero imprime el numero y despues lo suma
        System.err.println(a); 
        System.err.println(--a); // Es 4 pero primero descuenta y despues imprime el resultado

        // 10.
        a = 5;
        System.out.println(((a = a*2 + 4) >= 10) || false); // Operacion con operadores aritmeticos, comparacion y logicos
    }
}