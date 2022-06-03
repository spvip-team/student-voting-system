package za.co.spvip.student.voting.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.spvip.student.voting.system.entity.Candidate;
@Repositories

public interface CandidateRepository extends JpaRepository<Candidate,Long> {
    Candidate findCandidateByName(String name);

}
