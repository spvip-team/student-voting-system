package za.co.spvip.student.voting.system.services;

import za.co.spvip.student.voting.system.entity.Candidate;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAll();
    String Add();
}
