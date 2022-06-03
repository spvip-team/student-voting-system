package za.co.spvip.student.voting.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.spvip.student.voting.system.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findStudentByName(String name);

}
