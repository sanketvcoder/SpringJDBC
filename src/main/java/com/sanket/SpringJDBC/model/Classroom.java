package com.sanket.SpringJDBC.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Classroom {

    private int id;
    private int standard;
    private String section;
    private String teacherName;
    private List<Student> students;

    public Classroom() {
    }

    public Classroom(int id, int standard, String section, String teacherName, List<Student> students) {
        this.id = id;
        this.standard = standard;
        this.section = section;
        this.teacherName = teacherName;
        this.students = students;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classroom [id=" + id
                + ", standard=" + standard
                + ", section=" + section
                + ", teacherName=" + teacherName
                + ", students=" + students + "]";
    }
}
