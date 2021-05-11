package ro.sda.java15remote.finalProject.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "problems")
public class Problem {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID problemID;

    private int difficultyLevel;

    private int numberOfPoints;

    @ManyToMany(mappedBy = "problemsForThisCompany")
    private Set<Company> companiesWhichRequireThisProblem = new HashSet<>();

    @OneToMany(mappedBy = "problem")
    private List<Submission> submissionsForThisProblem = new ArrayList<>();
}
