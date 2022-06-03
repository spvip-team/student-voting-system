package za.co.spvip.student.voting.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.spvip.student.voting.system.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findStudentByName(String name);
    Student findByEmail(String email);
    Student findByNumber(int number);
    Student findByEmailAndNumber(String email,int number);
    Student findByEmailOrNumber(String email,int number);

}
