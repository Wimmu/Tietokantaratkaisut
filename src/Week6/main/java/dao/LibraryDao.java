package Week6.main.java.dao;

import Week6.main.java.model.Book;
import Week6.main.java.model.Student;
import jakarta.persistence.*;
import java.util.List;

public class LibraryDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");
    private EntityManager em = emf.createEntityManager();

    public void saveObject(Object obj) {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
    }

    public Student findStudent(Long id) {
        return em.find(Student.class, id);
    }

    public List<Book> getAllBooks() {
        return em.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }

    public void updateStudent(Long id, String newName) {
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        if (student != null) {
            student.setName(newName);
        }
        em.getTransaction().commit();
    }

    public void close() {
        em.close();
        emf.close();
    }
}
