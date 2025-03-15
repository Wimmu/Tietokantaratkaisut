package Week5.main.java.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimeSpent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int homeworkHours;
    private int inClassHours;
    private int theoryHours;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
