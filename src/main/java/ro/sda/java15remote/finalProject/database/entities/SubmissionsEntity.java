package ro.sda.java15remote.finalProject.database.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "submissions")
public class SubmissionsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID submissionsID;

    private int userID;

    private int problemID;

    private Date dateOfSubmissions;
}
