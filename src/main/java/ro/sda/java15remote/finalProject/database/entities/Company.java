package ro.sda.java15remote.finalProject.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID companyID;

    private String companyName;

    @ManyToMany
    @JoinTable(name = "problems_company",
            joinColumns = {@JoinColumn(name = "companyID")},
            inverseJoinColumns = {@JoinColumn(name = "problemID")})
    Set<Problem> problemsForThisCompany = new HashSet<>();
}
