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

@Service
@AllArgsConstructor
public class StuServiceImpl implements StuService {
    private final StuRepository stuRepository;

    @Override
    public List<Student> getAll() {
        return stuRepository.findAll();
    }

    @Override
    public ResponseEntity<String> Add(StuDto stuDto) {

        Student student = stuRepository.findProductByName(StuDto.getName());
        if (ObjectUtils.isEmpty(student)) {
            Student newProduct = new Student();
            newProduct.setName(StuDto.getName());
            newProduct.setInitials(StuDto.getInitials());
            newProduct.setStudentNumber(StuDto.getStudentNumber());

            StuRepository.save(newProduct);

            return ResponseEntity.status(HttpStatus.CREATED).body("successfully");
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body("The student with this name exist");
    }
}