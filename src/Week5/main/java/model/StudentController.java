package Week5.main.java.model;

import com.example.dbsclass.model.Student;
import com.example.dbsclass.model.TimeSpent;
import com.example.dbsclass.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Get a student by ID
    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return studentService.findStudentById(id);
    }

    // Add a new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    // Update a student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    // Add time spent by a student
    @PostMapping("/{studentId}/timeSpent")
    public TimeSpent addTimeSpent(@PathVariable Long studentId, @RequestBody TimeSpent timeSpent) {
        return studentService.addTimeSpent(studentId, timeSpent);
    }
}
