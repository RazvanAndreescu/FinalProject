package ro.sda.java15remote.finalProject.database.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "problems")
public class ProblemsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID problemID;

    private int difficultyLevel;

    private int numberOfPoints;
}
