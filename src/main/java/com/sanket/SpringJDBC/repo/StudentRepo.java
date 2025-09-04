package com.sanket.SpringJDBC.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sanket.SpringJDBC.Exception.ResourceNotFoundException;
import com.sanket.SpringJDBC.model.Student;

@Repository
public class StudentRepo {

    List<Student> list = new ArrayList<>();

    public void save(Student s) {
        list.add(s);
    }

    public List<Student> findAll() {
        if (list.isEmpty()) {
            throw new ResourceNotFoundException("No data found in database");
        }
        return list;
    }
}
