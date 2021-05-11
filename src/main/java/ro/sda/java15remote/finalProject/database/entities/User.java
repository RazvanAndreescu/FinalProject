package ro.sda.java15remote.finalProject.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID userID;

    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "accountID")
    private AccountType accountType;
    
    private int totalNumberOfPoints;

    @OneToMany(mappedBy = "user")
    private List<Submission> submissionsForThisUser = new ArrayList<>();
}
