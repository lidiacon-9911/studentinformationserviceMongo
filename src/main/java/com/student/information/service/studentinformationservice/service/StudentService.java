package com.student.information.service.studentinformationservice.service;

import java.util.List;

import com.student.information.service.studentinformationservice.modelos.Student;

public interface StudentService {
    List<Student> findAll();

    Student findByStudentNumber(Long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpa();

    void saveOrUpdateStudent(Student students);

    void deleteStudent(String id);

}
