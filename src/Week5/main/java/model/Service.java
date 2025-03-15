package Week5.main.java.model;

import com.example.dbsclass.model.Student;
import Week5.main.java.model.TimeSpent;
import com.example.dbsclass.repository.StudentRepository;
import com.example.dbsclass.repository.TimeSpentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TimeSpentRepository timeSpentRepository;

    // Add a new student
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    // Find a student by ID
    public Optional<Student> findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Update student details
    public Student updateStudent(Long id, Student updatedStudent) {
        return studentRepository.findById(id).map(student -> {
            student.setName(updatedStudent.getName());
            student.setEmail(updatedStudent.getEmail());
            return studentRepository.save(student);
        }).orElse(null);
    }

    // Add time spent by a student
    public TimeSpent addTimeSpent(Long studentId, TimeSpent timeSpent) {
        return studentRepository.findById(studentId).map(student -> {
            timeSpent.setStudent(student);
            return timeSpentRepository.save(timeSpent);
        }).orElse(null);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
