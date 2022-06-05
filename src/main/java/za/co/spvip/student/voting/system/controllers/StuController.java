package za.co.spvip.student.voting.system.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import za.co.spvip.student.voting.system.dto.StuDto;
import za.co.spvip.student.voting.system.entities.Student;
import za.co.spvip.student.voting.system.services.StuService;

import java.util.List;

public class StuController {
    @Autowired
    StuService StuService;

    @GetMapping("Students")
    ResponseEntity<List<Student>> getAllStudents(){

        return   ResponseEntity.ok(StuService.getAll());

    }
    @PostMapping("students")
    ResponseEntity<?> AddStudent(@RequestBody StuDto StuDto){

        return StuService.Add(StuDto);
    }
}
