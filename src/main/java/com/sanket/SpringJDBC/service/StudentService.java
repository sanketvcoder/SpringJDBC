package com.sanket.SpringJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sanket.SpringJDBC.model.Student;
import com.sanket.SpringJDBC.repo.StudentRepo;

@Component
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public void addStudent(Student s) {
        studentRepo.save(s);
        System.out.println("Student added successfully: " + s);
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public List<Student> searchStudents(String field, Object value) {
        return studentRepo.search(field, value);
    }
}
