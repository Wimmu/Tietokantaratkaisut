package Week6.main.java.model;

@Entity
public class PrintedBook extends Book {
    private int pageCount;

    public PrintedBook() {}
    public PrintedBook(String title, Author author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    // Getters & Setters
}
