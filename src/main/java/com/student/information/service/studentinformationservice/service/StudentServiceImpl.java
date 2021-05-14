package com.student.information.service.studentinformationservice.service;

import java.util.List;

import com.student.information.service.studentinformationservice.modelos.Student;
import com.student.information.service.studentinformationservice.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentRepositorys;

    @Override
    public List<Student> findAll() {
        return studentRepositorys.findAll();
    }

    @Override
    public Student findByStudentNumber(Long studentNumber) {
        return studentRepositorys.findByStudentNumber(studentNumber);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepositorys.findByEmail(email);
    }

    @Override
    public List<Student> findAllByOrderByGpa() {
        return studentRepositorys.findAllByOrderByGpa();
    }

    @Override
    public void saveOrUpdateStudent(Student students) {
        studentRepositorys.save(students);
    }

    @Override
    public void deleteStudent(String id) {
        studentRepositorys.deleteById(id);

    }

}
