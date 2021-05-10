package ro.sda.java15remote.finalProject.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "submissions")
public class SubmissionsEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID submissionsID;

    @ManyToOne
    @JoinColumn(name = "userID")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "problemID")
    private ProblemsEntity problemsEntity;

    private Date dateOfSubmissions;
}
