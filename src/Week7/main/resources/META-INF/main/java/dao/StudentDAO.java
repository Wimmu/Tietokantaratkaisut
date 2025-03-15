package Week7.main.resources.META;

import model.Student;
import jakarta.persistence.EntityManager;

public class StudentDAO extends GenericDAO<Student> {
    public StudentDAO(EntityManager entityManager) {
        super(Student.class, entityManager);
    }
}
