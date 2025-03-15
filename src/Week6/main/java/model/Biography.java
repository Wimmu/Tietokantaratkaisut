package Week6.main.java.model;

@Entity
public class Biography {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;

    private String bio;

    public Biography() {}
    public Biography(Author author, String bio) {
        this.author = author;
        this.bio = bio;
    }

    // Getters & Setters
}
