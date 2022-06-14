package za.co.spvip.student.voting.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.spvip.student.voting.system.entities.Vote;

public interface VoteRepository extends JpaRpository<Vote,Long>{
    Vote findStudentByName(String name);
    Vote findStudentByEmail(String email);
    Vote findStudentStudentNo(double studentNo);
    Vote findStudentByContact(double contact);
}
