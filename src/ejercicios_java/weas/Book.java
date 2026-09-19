package weas;

public class Book {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void bookData() {
        System.out.println("Titulo: " + title + " del autor " + author);
    }
}
