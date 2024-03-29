package ro.sda.java15remote.finalProject.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.sda.java15remote.finalProject.database.entities.Problem;

import java.util.UUID;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, UUID> {
}
