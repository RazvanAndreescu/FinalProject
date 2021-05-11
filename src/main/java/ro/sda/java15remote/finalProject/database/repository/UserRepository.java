package ro.sda.java15remote.finalProject.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.sda.java15remote.finalProject.database.entities.User;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    List<User> findUsersByFirstNameAndLastName(String firstName, String lastName);
    List<User> findUsersByLastName(String lastName);
    List<User> findUsersByFirstName(String firstName);
    List<User> findUserByTotalNumberOfPoints(Integer totalNumberOfPoints);

}
