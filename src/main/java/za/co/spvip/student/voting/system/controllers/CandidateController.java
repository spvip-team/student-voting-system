package za.co.spvip.student.voting.system.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import za.co.spvip.student.voting.system.entity.Candidate;
import za.co.spvip.student.voting.system.services.CandidateService;

import java.util.List;

@Controller
@AllArgsConstructor
public class CandidateController {
    @Autowired
    CandidateService candidateService;

    @GetMapping("candidate")
    ResponseEntity<List<Candidate>> getAllCandidate(){

      return   ResponseEntity.ok(candidateService.getAll());
    }

}
