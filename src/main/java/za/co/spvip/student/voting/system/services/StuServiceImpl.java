package za.co.spvip.student.voting.system.services;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import za.co.spvip.student.voting.system.dto.StuDto;
import za.co.spvip.student.voting.system.entities.Student;
import za.co.spvip.student.voting.system.repository.StuRepository;

import java.util.List;
import javax.persistence.Column;

@Service
@AllArgsConstructor
public class StuServiceImpl implements StuService {
    private final StuRepository stuRepository;

    @Override
    public List<Student> getAll() {

        return stuRepository.findAll();
    }

    @Override
    public ResponseEntity<?> Add(StuDto stuDto) {

        Student student = stuRepository.findByEmail(StuDto.getEmail);
        if (ObjectUtils.isEmpty(student)) {
            Student newStudent = new Student();
            newStudent.setName(StuDto.getName);
            newStudent.setSurname(StuDto.getSurname);
            newStudent.setAddress(StuDto.getAddress);
            newStudent.setEmail(StuDto.getEmail);
            newStudent.setPassword(StuDto.getPassword);


            return ResponseEntity.status(HttpStatus.CREATED).body("successfully");
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body("The student with this name exist");
    }
}