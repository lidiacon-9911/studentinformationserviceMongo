package com.student.information.service.studentinformationservice.repository;

import com.student.information.service.studentinformationservice.modelos.Student;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByStudentNumber(Long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpa();

}
