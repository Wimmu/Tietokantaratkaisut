package Week5.main.java.dao;

import Week5.main.java.model.TimeSpent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSpentRepository extends JpaRepository<TimeSpent, Long> {
}
