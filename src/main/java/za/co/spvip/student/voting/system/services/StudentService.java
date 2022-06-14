package za.co.spvip.student.voting.system.services;

import org.springframework.http.ResponseEntity;
import za.co.spvip.student.voting.system.dto.StudentDto;
import za.co.spvip.student.voting.system.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    ResponseEntity<?> Add(StudentDto studentDto);
}
