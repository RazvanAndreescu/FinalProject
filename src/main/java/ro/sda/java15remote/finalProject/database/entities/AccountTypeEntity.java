package ro.sda.java15remote.finalProject.database.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "accountType")
public class AccountTypeEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID accountID;

    private int type;

    @OneToMany(mappedBy = "accountTypeEntity")
    Set<UserEntity> usersWithSameAccountType = new HashSet<>();

}
