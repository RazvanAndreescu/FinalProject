package ro.sda.java15remote.finalProject.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "problems")
public class ProblemsEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID problemID;

    private int difficultyLevel;

    private int numberOfPoints;

    @ManyToMany(mappedBy = "problemsForThisCompany")
    private Set<CompanyEntity> companiesWhichRequireThisProblem = new HashSet<>();

    @OneToMany(mappedBy = "problemsEntity")
    private List<SubmissionsEntity> submissionsForThisProblem = new ArrayList<>();
}
