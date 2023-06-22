package Objects;

public class Book {
    // Конструктор
    public Book() {

    }
    public Book(String t, String a) {
        title = t;
        author = a;
    }
    public String title;
    public String author;

    public String toString() {
        return title;
    }
}
