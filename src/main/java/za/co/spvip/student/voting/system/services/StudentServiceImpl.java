package za.co.spvip.student.voting.system.services;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import za.co.spvip.student.voting.system.dto.StudentDto;
import za.co.spvip.student.voting.system.entities.Student;
import za.co.spvip.student.voting.system.repository.StudentRepository;

import javax.persistence.Column;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements  StudentService{
    private  final StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public ResponseEntity<?> Add(StudentDto studentDto) {

        Student student = studentRepository.findByEmail(studentDto.getEmail());
       if(ObjectUtils.isEmpty(student)){
           Student newStudent  = new Student();
           newStudent.setName(studentDto.getName());
           newStudent.setSurname(studentDto.getSurname());
           newStudent.setAddress(studentDto.getAddress());
           //TODO Need to auto generate
           //newStudent.setNumber();
           newStudent.setEmail(studentDto.getEmail());
           //TODO Encrypt the password
           newStudent.setPassword(studentDto.getPassword());
           studentRepository.save(newStudent);

           return ResponseEntity.status(HttpStatus.CREATED).body("Student created successfully");



       }
        return ResponseEntity.status(HttpStatus.CONFLICT).body("The student with this name exist");


    }
}






