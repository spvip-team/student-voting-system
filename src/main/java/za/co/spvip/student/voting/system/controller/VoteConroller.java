package za.co.spvip.student.voting.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import za.co.spvip.student.voting.system.dto.VoteDto;
import za.co.spvip.student.voting.system.entities.Vote;
import za.co.spvip.student.voting.system.service.VoteService;


@Controller
public class VoteController {
    @Autowired
    VoteService voteService;

    @GetMapping("vote")
    ResponseEntity<list<vote>> getAllVote(){

        return ResponseEntity.ok(voteService.getAll());
    }
    @PostMapping("vote")
    ResponseEntity<?> AddVote(@RequestBody VoteDto voteDto) {
        return voteService.Add((voteDto));

    }
}
