package za.co.spvip.student.voting.system.services;

import org.springframework.http.ResponseEntity;
import za.co.spvip.student.voting.system.dto.StuDto;
import za.co.spvip.student.voting.system.entities.Student;

import java.util.List;

public interface StuService {

    List<Student> getAll();

    ResponseEntity<String> Add(StuDto stuDto);
}
