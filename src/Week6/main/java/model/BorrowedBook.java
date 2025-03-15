package Week6.main.java.model;

import java.util.Date;

@Entity
public class BorrowedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Book book;

    @Temporal(TemporalType.DATE)
    private Date borrowDate;

    public BorrowedBook() {}
    public BorrowedBook(Student student, Book book, Date borrowDate) {
        this.student = student;
        this.book = book;
        this.borrowDate = borrowDate;
    }

    // Getters & Setters
}
