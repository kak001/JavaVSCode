package extras_ejercicios;

public class Person {
    // Atributos
    /* Como primera seccion de la clase, definimos las variables, su accesibilidad, si puede ser constante, 
    si puede ser estatica, el tipo de variable que es y finalmente el nombre de la variable. */
    private final String NAME;

    /* Definimos una variable que, es privada, solo se puede acceder desde la clase, es estatica, que pertenece
    a la misma clase y no a una instancia de la clase, es final, que es una constante, es de tipo String, cual
    solo puede contener cadenas de texto y finalmente su nombre es NAME, como buena practica esta en mayusculas
    para hacerle saber al programador que es una constante */

    // Constructor
    /* El constructor es un metodo especial, osea una funcion que se ejecuta cada vez que se crea un objeto con 
    new, su trabajo es inicializar el estado del objeto y dejar los atributos con valores validos desde el momento
    que nace */
    public Person(String NAME) {
        this.NAME = NAME;
    }

    // Getters y Setters
    /* Los getters y setters son funciones cuales me permite pedir los datos y definirmos desde fuera de la clase
    siempre en el contexto que los atributos sean privado y como buena practica siempre se definen segun 
    el contexto de la clase */
    public String getName() {
        return NAME;
    }

    /* public static void setNAME(String NAME) { 
           this.NAME = NAME;
    } */
    // Este metodo no funciona, ya que como la variables es final es una constante y se puede definirle otro valor

    // Metodos
    /* Los metodos son las cosas que puede hacer esta clase, en este contexto, una persona puede hablar, saludar,
    dormir, etc */
    public void sayHi() {
        ConsoleColors.message(NAME + " esta saludando al programador: ¡Hola!", ConsoleColors.GREEN);
    }

    public void talk() {
        ConsoleColors.message(NAME + " esta hablando.", ConsoleColors.YELLOW);
    }

    public void sleep() {
        ConsoleColors.message(NAME + " esta durmiendo... Zzz...", ConsoleColors.BLUE);
    }
}
