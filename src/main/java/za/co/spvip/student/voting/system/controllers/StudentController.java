package za.co.spvip.student.voting.system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import za.co.spvip.student.voting.system.dto.StudentDto;
import za.co.spvip.student.voting.system.entities.Student;
import za.co.spvip.student.voting.system.services.StudentService;

import java.util.List;

public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("students")
    ResponseEntity<List<Student>> getAllStudents(){
        return  ResponseEntity.ok(studentService.getAll());
    }
    @PostMapping("students")
    ResponseEntity<?>AddStudent(@RequestBody StudentDto studentDto){
        return  studentService.Add((studentDto));

    }
}
