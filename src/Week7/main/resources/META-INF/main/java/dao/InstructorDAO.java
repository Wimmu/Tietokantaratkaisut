package Week7.main.resources.META;

import model.Instructor;
import jakarta.persistence.EntityManager;

public class InstructorDAO extends GenericDAO<Instructor> {
    public InstructorDAO(EntityManager entityManager) {
        super(Instructor.class, entityManager);
    }
}
