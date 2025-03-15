package Week7.main.resources.META;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "progress_reports")
public class ProgressReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate reportDate;
    private String achievements;
    private String areasForImprovement;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @Version
    private int version;  // For optimistic locking

    // Getters and setters omitted for brevity
}
