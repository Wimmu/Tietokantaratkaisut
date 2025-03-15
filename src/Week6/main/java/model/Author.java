package Week6.main.java.model;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL)
    private Biography biography;

    public Author() {}
    public Author(String name) {
        this.name = name;
    }

    // Getters & Setters
}
