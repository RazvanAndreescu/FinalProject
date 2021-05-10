package ro.sda.java15remote.finalProject.database.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID companyID;

    private String companyName;
}
