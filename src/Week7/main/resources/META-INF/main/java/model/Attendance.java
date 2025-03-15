package Week7.main.resources.META;

import jakarta.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus status;

    private String notes;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "training_session_id")
    private TrainingSession trainingSession;

    // Getters and setters omitted for brevity
}
