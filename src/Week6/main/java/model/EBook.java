package Week6.main.java.model;

@Entity
public class EBook extends Book {
    private String fileFormat;

    public EBook() {}
    public EBook(String title, Author author, String fileFormat) {
        super(title, author);
        this.fileFormat = fileFormat;
    }

    // Getters & Setters
}
