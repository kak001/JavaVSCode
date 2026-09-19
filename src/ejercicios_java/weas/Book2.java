package ejercicios_java.weas;
public class Book2 {
    
    // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.

    // Atributos
    private String title;

    // Constructor
    public Book2(String title) {
        this.title = title;
    }

    // Getters
    public String getTitle() {
        return title;
    }
}
