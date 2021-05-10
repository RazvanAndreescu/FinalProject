package ro.sda.java15remote.finalProject.database.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "accountType")
public class AccountTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID accountID;

    private int type;
}
