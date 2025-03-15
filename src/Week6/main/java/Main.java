package Week6.main.java;

import Week6.main.java.dao.LibraryDAO;
import Week6.main.java.model.*;

import java.util.Date;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryDAO dao = new LibraryDAO();

        // Insert Authors & Biographies
        Author author1 = new Author("J.K. Rowling");
        Biography bio1 = new Biography(author1, "Famous for Harry Potter series.");
        author1.setBiography(bio1);
        dao.saveObject(author1);

        // Insert Books
        EBook ebook = new EBook("Digital Magic", author1, "PDF");
        PrintedBook printedBook = new PrintedBook("Paper Spells", author1, 300);
        dao.saveObject(ebook);
        dao.saveObject(printedBook);

        // Insert Students
        Student student = new Student("Alice Johnson");
        dao.saveObject(student);

        // Borrowed Book Entry
        BorrowedBook borrowedBook = new BorrowedBook(student, printedBook, new Date());
        dao.saveObject(borrowedBook);

        // Fetch & Display Books
        dao.getAllBooks().forEach(book -> System.out.println(book.getTitle()));

        // Update Student Name
        dao.updateStudent(1L, "Alice Updated");

        dao.close();
    }
}
