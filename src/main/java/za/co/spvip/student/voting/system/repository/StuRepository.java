package za.co.spvip.student.voting.system.repository;

import za.co.spvip.student.voting.system.entities.Student;

import java.util.List;

public interface StuRepository {
    static Student findProductByName(String name) {
        return null;
    }

    static void save(Student newProduct) {
    }

    List<Student> findAll();
}
