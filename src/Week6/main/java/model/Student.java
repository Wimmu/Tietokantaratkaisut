package Week6.main.java.model;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Student() {}
    public Student(String name) {
        this.name = name;
    }

    // Getters & Setters
}
