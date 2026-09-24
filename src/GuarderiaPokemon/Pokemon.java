/**
 * Clase abstracta que representa lo que TODOS los Pokémon de la guardería
 * tienen en común: nombre, nivel y vida.
 *
 * Es abstracta porque nunca existe un "Pokémon" genérico: siempre es
 * de Agua, Fuego o Planta, y cada tipo calcula su tarifa distinto.
 * calcularTarifa() queda como método abstracto: cada subclase
 * está OBLIGADA a implementarlo con su propia fórmula (polimorfismo).
 */
public abstract class Pokemon {

    protected String nombre;
    protected int nivel;
    protected int vida;

    public Pokemon(String nombre, int nivel, int vida) throws DatosInvalidosException {
        // Las validaciones van en el constructor: así es IMPOSIBLE
        // crear un Pokémon con datos inválidos en cualquier parte del programa.
        if (nombre.length() > 10) {
            throw new DatosInvalidosException("El nombre del Pokémon no puede tener más de 10 letras");
        }
        if (nivel < 0 || nivel > 100) {
            throw new DatosInvalidosException("El nivel del Pokémon debe estar entre 0 y 100");
        }
        if (vida <= 0) {
            throw new DatosInvalidosException("La vida del Pokémon debe ser mayor a 0");
        }

        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    /**
     * Cada tipo de Pokémon cobra distinto por día de hospedaje.
     * Al ser abstracto, cada subclase debe darle su propia implementación.
     */
    public abstract double calcularTarifa(int dias);

    @Override
    public String toString() {
        return nombre + " (Nivel " + nivel + ", Vida " + vida + ")";
    }
}
