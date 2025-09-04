package com.sanket.SpringJDBC.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sanket.SpringJDBC.model.Student;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    List<Student> list = new ArrayList<>();

    public void save(Student s) {
        String query = "insert into student(rollNo, name, marks) values(?, ?, ?)";
        int r = jdbcTemplate.update(query, s.getRollNo(), s.getName(), s.getMarks());

        if (r > 0) {
            System.out.println("Inserted successfully in database");
            list.add(s);
            System.out.println("Inserted successfully in list");
        } else {
            System.out.println("Insertion failed");
        }
    }

    public List<Student> findAll() {
        String sql = "select * from student";
        RowMapper<Student> rowMapper = (rs, rowNum) -> {
            Student s = new Student();
            s.setRollNo(rs.getInt("rollNo"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));
            return s;
        };

        return jdbcTemplate.query(sql, rowMapper);
    }
}
