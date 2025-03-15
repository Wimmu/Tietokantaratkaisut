package Week6.main.java.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @ManyToOne
    private Author author;

    public Book() {}
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    // Getters & Setters
}
