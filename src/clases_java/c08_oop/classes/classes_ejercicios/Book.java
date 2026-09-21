package clases_java.c08_oop.classes.classes_ejercicios;

public class Book {
    // Atributos
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
